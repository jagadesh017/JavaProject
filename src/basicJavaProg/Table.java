package basicJavaProg;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		System.out.println("enter wich table you want");
		Scanner sc= new Scanner(System.in);
		int value=sc.nextInt();
		
		for(int i=1; i<=10; i++) {
			
			 int table = i*value;
			System.out.println(value + " * " + i + " =" + table);
		}
		

	}

}
