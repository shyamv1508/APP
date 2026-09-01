import java.util.Scanner;

interface Confidential {
}

class Report implements Confidential {
}

class Resume {
}

class BankDocument implements Confidential {
}

public class DocumentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Report");
        System.out.println("2. Resume");
        System.out.println("3. Bank Document");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        Object document;

        if (choice == 1)
            document = new Report();
        else if (choice == 2)
            document = new Resume();
        else
            document = new BankDocument();

        if (document instanceof Confidential)
            System.out.println("Document is Confidential");
        else
            System.out.println("Document is Not Confidential");
    }
}
