package assignment12;

public class Order {

    int orderId;
    String customerName;
    double amount;
    double tax;
    double totalAmount;

    Order(int orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;
        calculateTax();
    }

    Order(int orderId, String customerName, double amount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.amount = amount;
        calculateTax();
    }

    void calculateTax() {
        tax = amount * 0.10; 
        totalAmount = amount + tax;
    }

    void displayOrder() {
        System.out.println("Order ID      : " + orderId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Amount       : " + amount);
        System.out.println("Tax          : " + tax);
        System.out.println("--------------------------");
        System.out.println("Total Amount : " + totalAmount);
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {

        Order o1 = new Order(101, 5000);
        Order o2 = new Order(102, "Ramesh", 8000);

        o1.displayOrder();
        o2.displayOrder();
    }
}