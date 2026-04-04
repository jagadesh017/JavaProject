package basicJavaProg;

public class TriangleStars {

	public static void main(String[] args) {
		
		//printing * in assending order
		for(int i=1; i<=5; i++) {
			for (int j=1; j<=i ; j++) {
				System.out.print(i); // if you provide * will get stars in console
			}
			System.out.println();
		}
	
// to print * in disanding order
	for (int k=1;k<=5; k++) {
		for(int l=5; l>=k; l--) {
			System.out.print(k);
		}
		System.out.println();
	}
	
	
	for(int i=1; i<=5; i++) {
		for(int j=5-1; j>=i;j--) {
			System.out.print("");
		}
		for(int k=1; k<=i;k++) {
			System.out.print("* ");
		}
		System.out.print("\n");

	}

}
	
	
}
