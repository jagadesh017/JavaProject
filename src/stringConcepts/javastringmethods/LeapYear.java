package stringConcepts.javastringmethods;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		System.out.println("enter year");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();

		if (year % 4 == 0 & year % 2 == 0) {

			System.out.println("year is leap");

		} else {
			System.out.println("year is not leap");
		}
sc.close();
	}
}
