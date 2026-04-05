package basicJavaProg;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		System.out.println("enter any year ");
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		
		//if((( year%4==0) && (year%100!=0)) || (year%400==0)) {
		if(year%4==0) {
			System.out.println("mentioned year is leap year :"+ year);
		}else {
			System.out.println("mentioned year is not leap year :" + year);
		}
sc.close();
	}

}
