package Javaprograms;

public class PeramidStars {

	public static void main(String[] args) {
		
		/*
		 * for(int i=1; i<=5; i++) { for(int j=5-1; j>=i;i--) { System.out.print(""); }
		 * for(int k=1; k<=i;k++) { System.out.print("* "); } System.out.print("/n"); }
		 */

	
///new logic
	
	for(int i=1; i<=5;i++) {
		for (int j=5; j>=1;j--) {
			if(i>=j) {
				System.out.print("* ");
			}else {
				System.out.print("");
			}
		} 
		System.out.println();
	}
	}
}
