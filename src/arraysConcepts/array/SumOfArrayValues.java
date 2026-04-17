package arraysConcepts.array;

public class SumOfArrayValues {

	public static void main(String[] args) {

		int []a = { 1, 2, 3, 4, 5, 6, 7, 8, 9,10 };

		int sum = 0;

        for (int j : a) {
            sum = sum + j;

        }
		System.out.println(sum);

	}

}
