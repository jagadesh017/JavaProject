package overriding;

public class SBI extends RBI implements Loan{

	public static void main(String[] args) {
		
		SBI rate= new SBI();
		rate.homeLoanIntRate();
		rate.carLoan();
		rate.homeLoan();

	}

	public void homeLoanIntRate() {
		System.out.println("SBI is offering home loan at 9.5%");
	}
	
	public void homeLoan() {
		System.out.println("sbi offers home loan");
		
	}

	public void carLoan() {
		System.out.println("sbi offers car loan");
		
	}

}
