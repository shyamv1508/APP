package HospitalManagement;

public class Main {
    public static void main(String[] args) {
        Doctor d1 = new Doctor("D101", "Dr. Arun", "Cardiology", 800);
        Doctor d2 = new Doctor("D102", "Dr. Priya", "Dermatology", 600);

        Patient p1 = new Patient("P101", "Rahul", 25, "Heart checkup");
        Patient p2 = new Patient("P102", "Anitha", 30, "Skin allergy");
        Patient p3 = new Patient("P103", "Karthik", 40, "Chest pain");

        p1.assignDoctor(d1);
        p2.assignDoctor(d2);
        p3.assignDoctor(d1);

        System.out.println("=== PATIENT DETAILS ===");
        p1.display();
        System.out.println();
        p2.display();
        System.out.println();
        p3.display();

        int d1Patients = 2;
        int d2Patients = 1;

        System.out.println("\n=== TOTAL CONSULTATION FEES ===");
        System.out.println(d1.getName() + " : " + (d1Patients * d1.getConsultationFee()));
        System.out.println(d2.getName() + " : " + (d2Patients * d2.getConsultationFee()));
    }
}
