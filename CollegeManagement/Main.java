package CollegeManagement;

import CollegeManagement.course.Course;
import CollegeManagement.student.Student;

public class Main {

    public static void main(String[] args) {

        Student s = new Student(
                "S101",
                "Shyam",
                "CSE",
                19
        );

        Course c = new Course(
                "CS101",
                "Java Programming",
                4
        );

        System.out.println("=== STUDENT DETAILS ===");
        s.display();

        System.out.println();

        System.out.println("=== COURSE DETAILS ===");
        c.display();
    }
}