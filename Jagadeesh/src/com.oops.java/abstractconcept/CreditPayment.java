package abstractconcept;

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


