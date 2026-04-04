package oopsConcepts.abstractconcept;

    // Concrete class 1: Credit Card implementation
class CreditCard extends Payment {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing Credit Card payment of $" + amount + " via Bank Gateway.");
    }
     void showReceipt(double amount) {
        super.showReceipt(100);
        System.out.println(" Child Receipt generated for: $" + amount);
    }
}

// Concrete class 2: UPI implementation
class UPI extends Payment {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing UPI payment of $" + amount + " using Virtual Private Address.");
    }
}


