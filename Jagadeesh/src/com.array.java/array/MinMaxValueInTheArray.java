package array;

public class MinMaxValueInTheArray {
public static void main(String[] args) {
		
		int a[]= {3,6,8,4,1,9,2,7};
		int min=1;
		int max=1;
		for(int i=0;i<a.length;i++) {
			if(min>=a[i]) {
				min=a[i];		
			}
		}
		System.out.println(min);
		for(int j=0;j<a.length;j++) {
			if(max<=a[j]) {
				max=a[j];
			}
		}
		System.out.println(max);
	}
}
