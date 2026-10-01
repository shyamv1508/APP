import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class StudentCourseManagement extends JFrame {

    JList<String> courseList;
    JTable table;
    DefaultTableModel model;

    StudentCourseManagement() {

        setTitle("Student Course Management");
        setSize(650, 400);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String courses[] = {
            "Java Programming",
            "Data Structures",
            "Operating Systems",
            "Database Management",
            "Computer Networks"
        };

        courseList = new JList<>(courses);

        JScrollPane courseScroll =
            new JScrollPane(courseList);

        add(courseScroll, BorderLayout.WEST);

        String columns[] = {
            "Student Name",
            "Selected Course",
            "Enrollment Status"
        };

        model = new DefaultTableModel(columns, 0);

        table = new JTable(model);

        JScrollPane tableScroll =
            new JScrollPane(table);

        add(tableScroll, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();

        JButton addButton = new JButton("Add");
        JButton removeButton = new JButton("Remove");

        buttonPanel.add(addButton);
        buttonPanel.add(removeButton);

        add(buttonPanel, BorderLayout.SOUTH);

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String course = courseList.getSelectedValue();

                if (course != null) {

                    String name = JOptionPane.showInputDialog(
                        StudentCourseManagement.this,
                        "Enter Student Name:"
                    );

                    if (name != null && !name.isEmpty()) {
                        model.addRow(
                            new Object[] {
                                name,
                                course,
                                "Enrolled"
                            }
                        );
                    }
                } else {
                    JOptionPane.showMessageDialog(
                        StudentCourseManagement.this,
                        "Please select a course."
                    );
                }
            }
        });

        removeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                int row = table.getSelectedRow();

                if (row != -1) {
                    model.removeRow(row);
                } else {
                    JOptionPane.showMessageDialog(
                        StudentCourseManagement.this,
                        "Please select a registration."
                    );
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new StudentCourseManagement();
    }
}
