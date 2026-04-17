package basicJavaProg;

public class SwapData {

	public static void main(String[] args) {

		int i = 100;
		int j = 200;

        i = i+j; // i=300
        j=i-j; // j=300-200=100
        i=i-j; // i=300-100=200

        System.out.println("value of i is " + i);
        System.out.println("value of j is " + j);
	}

}
