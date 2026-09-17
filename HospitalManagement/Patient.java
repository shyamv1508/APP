package HospitalManagement;

public class Patient {
    private String patientId;
    private String name;
    private int age;
    private String problem;
    private Doctor treatingDoctor;

    public Patient(String patientId, String name, int age, String problem) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.problem = problem;
    }

    public void assignDoctor(Doctor doctor) {
        this.treatingDoctor = doctor;
    }

    public Doctor getTreatingDoctor() { return treatingDoctor; }

    public void display() {
        System.out.println("Patient ID      : " + patientId);
        System.out.println("Patient Name    : " + name);
        System.out.println("Age             : " + age);
        System.out.println("Problem         : " + problem);
        System.out.println("Treating Doctor : " +
                (treatingDoctor == null ? "Not Assigned" : treatingDoctor.getName()));
    }
}
