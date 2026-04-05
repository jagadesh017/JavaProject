package basicJavaProg;

import java.util.Scanner;

public class PalendromeNumber {

	public static void main(String[] args) {

		System.out.println("enter any number ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int val1;
		int sum = 0;
		int r = num;
		while (num > 0) {
			val1 = num % 10;
			sum = (sum * 10) + val1;
			num = num / 10;
		}
		System.out.println(sum);
		sc.close();
		if (r == sum) {
			System.out.println("The given number is palindrome");
		} else {
			System.out.println("The given number is not palindrome");
		}

		System.out.println("Enter a value");

		Scanner sca = new Scanner(System.in);
		int numb = sca.nextInt();
		int remainder;
		int reverse = 0;
		int t = numb;
		while (numb != 0) {
			remainder = numb % 10;
			reverse = (reverse * 10) + remainder;
			numb = numb / 10;
		}
		System.out.println(reverse);
		sca.close();
		if (t == reverse) {
			System.out.println("The given number is palindrome");
		} else {
			System.out.println("The given number is not palindrome");
		}
	}
}
