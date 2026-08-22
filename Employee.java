public class Employee {
    String name;
    int employeeId;
    double basicSalary;

    public Employee(String name, int employeeId, double basicSalary) {
        this.name = name;
        this.employeeId = employeeId;
        this.basicSalary = basicSalary;
    }

    public double calculateSalary() {
        return basicSalary;
    }

    public static void main(String[] args) {

        Employee e1 = new Professor("Arun", 101, 50000);
        Employee e2 = new LabAssistant("Priya", 102, 30000);
        Employee e3 = new AdministrativeStaff("Ravi", 103, 25000);

        System.out.println("Professor Salary: " + e1.calculateSalary());
        System.out.println("Lab Assistant Salary: " + e2.calculateSalary());
        System.out.println("Administrative Staff Salary: " + e3.calculateSalary());
    }
}

class Professor extends Employee {

    public Professor(String name, int employeeId, double basicSalary) {
        super(name, employeeId, basicSalary);
    }

    @Override
    public double calculateSalary() {
        return basicSalary + 10000;
    }
}

class LabAssistant extends Employee {

    public LabAssistant(String name, int employeeId, double basicSalary) {
        super(name, employeeId, basicSalary);
    }

    @Override
    public double calculateSalary() {
        return basicSalary + 5000;
    }
}

class AdministrativeStaff extends Employee {

    public AdministrativeStaff(String name, int employeeId, double basicSalary) {
        super(name, employeeId, basicSalary);
    }

    @Override
    public double calculateSalary() {
        return basicSalary + 3000;
    }
}
