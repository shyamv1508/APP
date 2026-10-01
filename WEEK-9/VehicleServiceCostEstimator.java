import javax.swing.*;
import java.awt.*;
class VehicleModel { int calculateCost(boolean g,boolean o,boolean b,boolean ba){ int t=0; if(g)t+=1000; if(o)t+=800; if(b)t+=1200; if(ba)t+=500; return t; } }
class VehicleView extends JFrame {
    JTextField regField=new JTextField(); JRadioButton twoWheeler=new JRadioButton("Two Wheeler",true), car=new JRadioButton("Car");
    JCheckBox general=new JCheckBox("General Service - ₹1000"), oil=new JCheckBox("Oil Change - ₹800"), brake=new JCheckBox("Brake Service - ₹1200"), battery=new JCheckBox("Battery Check - ₹500");
    JButton calculate=new JButton("Calculate Cost"); JLabel result=new JLabel("Total: ₹0");
    VehicleView(){ setTitle("Vehicle Service Cost Estimator"); setSize(450,350); setLayout(new GridLayout(9,1,5,5)); setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); add(new JLabel("Registration Number:")); add(regField); ButtonGroup g=new ButtonGroup(); g.add(twoWheeler);g.add(car);add(twoWheeler);add(car);add(general);add(oil);add(brake);add(battery);add(calculate);add(result);setLocationRelativeTo(null);setVisible(true); }
}
class VehicleController { VehicleModel model; VehicleView view; VehicleController(VehicleModel m,VehicleView v){model=m;view=v;view.calculate.addActionListener(e->calculate());} void calculate(){view.result.setText("Total: ₹"+model.calculateCost(view.general.isSelected(),view.oil.isSelected(),view.brake.isSelected(),view.battery.isSelected()));} }
public class VehicleServiceCostEstimator { public static void main(String[] args){SwingUtilities.invokeLater(()->new VehicleController(new VehicleModel(),new VehicleView()));} }