package CollegeManagement.student;

public class Student {
    String studentId;
    String name;
    String department;
    int age;

    public Student(String studentId, String name, String department, int age) {
        this.studentId = studentId;
        this.name = name;
        this.department = department;
        this.age = age;
    }

    public void display() {
        System.out.println("Student ID : " + studentId);
        System.out.println("Name       : " + name);
        System.out.println("Department : " + department);
        System.out.println("Age        : " + age);
    }
}