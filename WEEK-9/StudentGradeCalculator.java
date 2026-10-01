import javax.swing.*;
import java.awt.*;

class StudentModel {
    String name; int mark1, mark2, mark3, total; double average; String grade;
    void calculate(String name, int m1, int m2, int m3) {
        this.name=name; mark1=m1; mark2=m2; mark3=m3; total=m1+m2+m3; average=total/3.0;
        if(average>=90) grade="A"; else if(average>=75) grade="B"; else if(average>=60) grade="C"; else if(average>=50) grade="D"; else grade="F";
    }
}
class StudentView extends JFrame {
    JTextField nameField=new JTextField(), mark1Field=new JTextField(), mark2Field=new JTextField(), mark3Field=new JTextField();
    JButton calculateButton=new JButton("Calculate Result"); JLabel resultLabel=new JLabel("Result: ");
    StudentView(){ setTitle("Student Grade Calculator"); setSize(400,300); setLayout(new GridLayout(6,2,5,5)); setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new JLabel("Student Name:")); add(nameField); add(new JLabel("Subject 1:")); add(mark1Field); add(new JLabel("Subject 2:")); add(mark2Field); add(new JLabel("Subject 3:")); add(mark3Field); add(calculateButton); add(resultLabel); setLocationRelativeTo(null); setVisible(true); }
}
class StudentController {
    StudentModel model; StudentView view;
    StudentController(StudentModel m, StudentView v){ model=m; view=v; view.calculateButton.addActionListener(e->calculate()); }
    void calculate(){ try{ model.calculate(view.nameField.getText(),Integer.parseInt(view.mark1Field.getText()),Integer.parseInt(view.mark2Field.getText()),Integer.parseInt(view.mark3Field.getText())); view.resultLabel.setText(String.format("Total: %d, Avg: %.2f, Grade: %s",model.total,model.average,model.grade)); }catch(Exception e){ JOptionPane.showMessageDialog(view,"Enter valid marks."); } }
}
public class StudentGradeCalculator { public static void main(String[] args){ SwingUtilities.invokeLater(()->new StudentController(new StudentModel(),new StudentView())); } }