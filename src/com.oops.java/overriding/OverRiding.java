package overriding;

class BankAccount {
    double balance = 10000;
    
    // Generic method in parent class
    void calculateInterest() {
        System.out.println("Generic Interest: " + (balance * 0.02));
    }
}

class SavingsAccount extends BankAccount {
    // Overriding to provide specific logic for Savings
    @Override
    void calculateInterest() {
        System.out.println("Savings Interest (5%): " + (balance * 0.05));
    }
}

class FixedDepositAccount extends BankAccount {
    // Overriding to provide specific logic for FD
    @Override
    void calculateInterest() {
        super.calculateInterest();
        System.out.println("FD Interest (8%): " + (balance * 0.08));
    }
}

public class OverRiding {
    public static void main(String[] args) {
        // Runtime Polymorphism: Reference is BankAccount, but object is SavingsAccount
        FixedDepositAccount myAccount = new FixedDepositAccount();
        myAccount.calculateInterest(); // Output: Savings Interest (5%): 500.0
    }
}
