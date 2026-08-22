import java.util.Scanner;

public class Payment {

    interface PaymentMethod {
        void makePayment(double amount);
    }

    static class UPI implements PaymentMethod {

        @Override
        public void makePayment(double amount) {
            System.out.println("UPI Payment Successful");
            System.out.println("Amount: " + amount);
        }
    }

    static class CreditCard implements PaymentMethod {

        @Override
        public void makePayment(double amount) {
            System.out.println("Credit Card Payment Successful");
            System.out.println("Amount: " + amount);
        }
    }

    static class NetBanking implements PaymentMethod {

        @Override
        public void makePayment(double amount) {
            System.out.println("Net Banking Payment Successful");
            System.out.println("Amount: " + amount);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. UPI");
        System.out.println("2. Credit Card");
        System.out.println("3. Net Banking");

        int choice = sc.nextInt();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        PaymentMethod payment;

        if (choice == 1) {
            payment = new UPI();
        } else if (choice == 2) {
            payment = new CreditCard();
        } else if (choice == 3) {
            payment = new NetBanking();
        } else {
            System.out.println("Invalid choice");
            sc.close();
            return;
        }

        payment.makePayment(amount);

        sc.close();
    }
}
