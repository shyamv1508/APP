import java.util.Scanner;

interface Payment {
    void pay(double amount);
}

class CreditCardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Credit Card Payment: " + amount);
    }
}

class UPIPayment implements Payment {
    public void pay(double amount) {
        System.out.println("UPI Payment: " + amount);
    }
}

class NetBankingPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Net Banking Payment: " + amount);
    }
}

public class ShoppingPayment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Credit Card");
        System.out.println("2. UPI");
        System.out.println("3. Net Banking");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        Payment p;

        if (choice == 1)
            p = new CreditCardPayment();
        else if (choice == 2)
            p = new UPIPayment();
        else
            p = new NetBankingPayment();

        p.pay(amount);
    }
}
