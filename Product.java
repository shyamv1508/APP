import java.util.Scanner;

public abstract class Product {

    int productId;
    String name;
    double price;

    Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    abstract double calculateDiscount();

    double calculateFinalPrice() {
        return price - calculateDiscount();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Electronics");
        System.out.println("2. Clothing");
        System.out.println("3. Books");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Product Name: ");
        String name = sc.next();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        Product product;

        if (choice == 1) {
            product = new Electronics(id, name, price);
        }
        else if (choice == 2) {
            product = new Clothing(id, name, price);
        }
        else if (choice == 3) {
            product = new Books(id, name, price);
        }
        else {
            System.out.println("Invalid choice");
            sc.close();
            return;
        }

        System.out.println("Product Name: " + product.name);
        System.out.println("Price: " + product.price);
        System.out.println("Discount: " + product.calculateDiscount());
        System.out.println("Final Price: " + product.calculateFinalPrice());

        sc.close();
    }
}

class Electronics extends Product {

    Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    double calculateDiscount() {
        return price * 0.10;
    }
}

class Clothing extends Product {

    Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    double calculateDiscount() {
        return price * 0.20;
    }
}

class Books extends Product {

    Books(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    double calculateDiscount() {
        return price * 0.15;
    }
}
