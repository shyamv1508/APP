import java.util.Scanner;

public class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int accountNumber = sc.nextInt();
        String accountHolderName = sc.next();
        double balance = sc.nextDouble();

        BankAccount account = new BankAccount(
            accountNumber,
            accountHolderName,
            balance
        );

        double depositAmount = sc.nextDouble();
        double withdrawAmount = sc.nextDouble();

        account.deposit(depositAmount);
        account.withdraw(withdrawAmount);

        account.display();

        sc.close();
    }
}
