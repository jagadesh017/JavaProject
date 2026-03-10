package overriding;

public class HDFC extends RBI{

	public static void main(String[] args) {
		HDFC rate2 = new HDFC();
		rate2.homeLoanIntRate();

	}

	public void homeLoanIntRate() {
		System.out.println("HDFC is offering home loan at 11%");
	}

}
