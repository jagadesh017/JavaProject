package Javaprograms;

public class SwapData {

	public static void main(String[] args) {

		int i = 100;
		int j = 200;

		i = i + j;
		j = i - j;
		i = i - j;
		System.out.println(i);
		System.out.println(j);

		// without third variable
		int k=i;
			j=i;
			i=k;			
			System.out.println(i);
			System.out.println(j);

	}

}
