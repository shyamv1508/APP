import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UserLogin extends JFrame {

    JTextField username;
    JPasswordField password;
    JCheckBox remember, notifications;

    UserLogin() {

        setTitle("User Login");
        setSize(400, 300);
        setLayout(new GridLayout(5, 2));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new JLabel("Username:"));
        username = new JTextField();
        add(username);

        add(new JLabel("Password:"));
        password = new JPasswordField();
        add(password);

        remember = new JCheckBox("Remember Me");
        add(remember);

        notifications = new JCheckBox("Receive Notifications");
        add(notifications);

        JButton login = new JButton("Login");
        add(login);

        login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String user = username.getText();
                String pass = new String(password.getPassword());

                if (user.equals("admin") && pass.equals("1234")) {
                    JOptionPane.showMessageDialog(
                        UserLogin.this,
                        "Login Successful!"
                    );
                } else {
                    JOptionPane.showMessageDialog(
                        UserLogin.this,
                        "Invalid Username or Password"
                    );
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new UserLogin();
    }
}
