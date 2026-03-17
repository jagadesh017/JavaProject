package overloading;
class PaymentGateway {
    // 1. Overloading by parameter types (UPI Payment)
    public void makePayment(String upiId, double amount) {
        System.out.println("Processing UPI payment of ₹" + amount + " to " + upiId);
    }

    // 2. Overloading by number of parameters (Credit Card Payment)
    public void makePayment(long cardNumber, int cvv, String expiry, double amount) {
        System.out.println("Processing Credit Card payment of ₹" + amount + " for card: " + cardNumber);
    }

    // 3. Overloading by order/types (Bank Transfer)
    public void makePayment(double amount, String accountNo, String ifsc) {
        System.out.println("Processing Bank Transfer of ₹" + amount + " to Account: " + accountNo);
    }
}

public class Main {
    public static void main(String[] args) {
        PaymentGateway pg = new PaymentGateway();

        // Compiler decides which method to call based on arguments provided
        pg.makePayment("user@okaxis", 500.0);                                // Calls UPI method
        pg.makePayment(1234567812345678L, 123, "12/28", 2500.0);            // Calls Credit Card method
        pg.makePayment(10000.0, "987654321", "SBIN000123");                // Calls Bank Transfer method
    }
}
