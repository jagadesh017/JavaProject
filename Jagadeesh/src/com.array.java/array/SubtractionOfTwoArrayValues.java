package array;

public class SubtractionOfTwoArrayValues {
	
	public static void main(String[] args) {
		
		int a[]= {4,5,6};
		int b[]= {1,2,3};
		int c;
		int sum=0;
		int sum1=0;
		
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
		for(int j=0;j<b.length ;j++) {
			sum1=sum1+b[j];
		}
		System.out.println(sum1);
		c=sum-sum1;
		System.out.println(c);
	}
}