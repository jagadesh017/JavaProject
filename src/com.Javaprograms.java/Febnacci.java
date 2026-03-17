package Javaprograms;

import java.util.Scanner;

public class Febnacci {

	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		int c;
		
		System.out.println("enter any number");
		Scanner sc = new Scanner(System.in);
		int numb=sc.nextInt();
		
		for(int i=0; i<numb; i++) {
			
			c= a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
		

	}

}
