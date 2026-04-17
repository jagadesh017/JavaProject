package arraysConcepts.array;

import java.util.Arrays;

public class MinMaxValueInTheArray {
public static void main(String[] args) {
		
		int []a= {3,6,8,4,1,9,2,7};
    Arrays.sort(a);
    System.out.println("min value in the array is: "+a[0]);
    System.out.println("max value in the array is: "+a[a.length-1]);

		int min=a[0];
		int max=a[0];
    for (int k : a) {
        if (min >= k) {
            min = k;
        }
    }
		System.out.println(min);
    for (int i : a) {
        if (max <= i) {
            max = i;
        }
    }
		System.out.println(max);
	}
}
