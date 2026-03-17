package Javaprograms;

import java.util.Scanner;

public class AllPrimeNumbers {

	public static void main(String[] args) {
		
		
		System.out.println("enter any number");
		Scanner sc = new Scanner(System.in);
		int number= sc.nextInt();
		
		int count = 0;
		int num;
		for(int i=1;i<=number;i++) {
			num=i;
			count=0;
			for(int j=1;j<=count;j++) {
				if(num%j==0) {
					count++;
				}
				if(count==2) {
					System.out.println();
				}
					
			}
		}
		
	}
	

}
