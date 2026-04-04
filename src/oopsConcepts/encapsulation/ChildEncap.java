package oopsConcepts.encapsulation;

public class ChildEncap{

      public static void main(String[] args) {
        
        BankAccount ba= new BankAccount("12345", 100);
        ba.setAccountNumber("54321");
        ba.deposit(1000);
        System.out.println("desposit amount" +ba.getBalance());
        ba.withdraw(50);
        System.out.println("withdraw amount" + ba.getBalance());
        System.out.println(ba.getAccountNumber());
    }
}
