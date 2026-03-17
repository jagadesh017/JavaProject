package abstractconcept;

    // Abstract class defining the template
    abstract class Payment {
        
    // Abstract method: No body, forces subclasses to implement their logic
    abstract void processPayment(double amount);

    // Concrete method: Common functionality shared by all
    void showReceipt(double amount) {
        System.out.println("Receipt generated for: $" + amount);
    }
}
    //--------------------------------------
    class CC extends Payment {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing Credit Card payment of $" + amount + " via Bank Gateway.");
    }
     void showReceipt(double amount) {
        super.showReceipt(100);
        System.out.println(" Child Receipt generated for: $" + amount);
    }
}
//--------------------------------------------
// Concrete class 2: UPI implementation
class UPIS extends Payment {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing UPI payment of $" + amount + " using Virtual Private Address.");
    }
//----------------------------------------------   
public class CreditPayment {
    public static void main(String[] args) {
        // We use the abstract reference to point to concrete objects
        Payment myPayment = new CreditCard();
        myPayment.showReceipt(100);

        CreditCard ob=  (CreditCard)myPayment;
        ob.showReceipt(50);

        myPayment.processPayment(250.0);
        myPayment.showReceipt(250.0);

       myPayment = new UPI();
        myPayment.processPayment(100.0);
    }
} 
}