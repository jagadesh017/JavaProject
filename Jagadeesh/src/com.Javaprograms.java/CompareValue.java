package Javaprograms;

import java.util.Scanner;

public class CompareValue {

	public static void main(String[] args) {
			
		System.out.println("enter 'a' value");
		
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		
		System.out.println("enter 'b' value");
		Scanner sc2 = new Scanner(System.in);
		int b=sc2.nextInt();
		
		System.out.println("enter 'c' value");
		Scanner sc3 = new Scanner(System.in);
		int c=sc3.nextInt();

		if((a<b) && (a<c))
		{
			System.out.println("a is low number out of three numbers vlaue is "+a);
			
		}
		else if((b<a)&&(b<c))
		{
			System.out.println("b is low number out of three numbers value is "+b);
		}
		else
		{
			System.out.println("c is low number out of three numbers value is" +c);
		}

	}
}
