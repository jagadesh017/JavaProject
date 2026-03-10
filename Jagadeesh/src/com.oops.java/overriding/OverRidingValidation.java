package overriding;
class Account {
    double balance = 10000;
    
    // Generic method in parent class
    void calculateInterest() {
        System.out.println("Generic Interest: " + (balance * 0.02));
    }
}

class CurrentAccount extends Account {
    // Overriding to provide specific logic for Savings
    @Override
    void calculateInterest() {
        System.out.println("Savings Interest (5%): " + (balance * 0.05));
    }
}

class FDAccount extends BankAccount {
    // Overriding to provide specific logic for FD
    @Override
    void calculateInterest() {
        System.out.println("FD Interest (8%): " + (balance * 0.08));
    }
}

public class OverRidingValidation {
    public static void main(String[] args) {
        // Runtime Polymorphism: Reference is BankAccount, but object is SavingsAccount
        Account myAccount = new CurrentAccount();
        myAccount.calculateInterest(); // Output: Savings Interest (5%): 500.0
    }
}

