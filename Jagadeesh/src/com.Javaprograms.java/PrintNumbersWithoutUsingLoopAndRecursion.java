package javatrickyprograms;

import java.util.Arrays;

public class PrintNumbersWithoutUsingLoopAndRecursion {
	
	// print numbers from 1 to 100 without using loop and recursion
	//1.Array.fill
	
	public static void main(String[] args) {
		
		Object num[]=new Object[100];
		
		Arrays.fill(num,new Object() {
		
			int count=0;
		@Override
		public String toString() {
			return Integer.toString(++count);	
		}		
		});
		System.out.println(Arrays.toString(num));
	}
}