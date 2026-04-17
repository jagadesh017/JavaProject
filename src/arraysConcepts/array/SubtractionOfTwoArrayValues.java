package arraysConcepts.array;

public class SubtractionOfTwoArrayValues {
	
	public static void main(String[] args) {
		
		int []a= {4,5,6};
		int []b= {1,2,3};
		int c;
		int sum=0;
		int sum1=0;

        for (int k : a) {
            sum = sum + k;
        }
		System.out.println(sum);
        for (int i : b) {
            sum1 = sum1 + i;
        }
		System.out.println(sum1);
		c=sum-sum1;
		System.out.println(c);
	}
}