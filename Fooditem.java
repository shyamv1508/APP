import java.util.Scanner;
Scanner sc = new Scanner(System.ln);
public class Fooditem{
    int itemID,price,quantity;
    +0001424758/000
    string itemName;
    void get_det(){
        itemID = sc.nextInt();
        itemName = sc.nextLine();
        price = sc.nextInt();
        quantity = sc.nextInt();
    }


public static void  calculateBill(){
    double st,B;
    double d = 50;
    st = f1.price*f1.quantity + f2.price*f2.quantity;
    if(st >= 1000){
        d = 0;
    }
    b = st + d;
    system.out.println("Subtotal: " + st + "\nDelivery: " + d + "\nFinal Bill: " + b);
    return Null;
    
}

public static void calculateBill(double discount){
    double st,B,dis;
    dis = discount;
    double d = 50;
    st = f1.price*f1.quantity + f2.price*f2.quantity;
    st = st*d/100;
    if(st >= 1000){
        d = 0;
    }
    b = st + d;
    system.out.println("Subtotal: " + st + "\nDelivery: " + d + "\nFinal Bill: " + b);
    return Null;
}

public static void calculateBill(double discount,double delivery){
    double st,B;
    double d = delivery,dis = discount;
    st = f1.price*f1.quantity + f2.price*f2.quantity;
    st = st*dis/100;
    if(st >= 1000){
        d = 0;
    }
    b = st + d;
    system.out.println("Subtotal: " + st + "\nDelivery: " + d + "\nFinal Bill: " + b);

    return Null;
}

public static void main(String args[]) {
    Fooditem f1 = new Fooditem();
    Fooditem f2 = new Fooditem();
    f1.get_det();
    f2.get_det();
    calculateBill();
    calculateBill(50);
    calculateBill(50,50);
    

}
}