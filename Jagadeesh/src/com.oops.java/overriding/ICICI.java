package overriding;

public class ICICI extends RBI{

	public static void main(String[] args) {
		ICICI rate1 = new ICICI();
		rate1.homeLoanIntRate();
	}

	public void homeLoanIntRate() {
		System.out.println("ICICI is offering home loan at 10%");
	}
}
