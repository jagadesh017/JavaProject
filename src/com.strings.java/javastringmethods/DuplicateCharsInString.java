package javastringmethods;

public class DuplicateCharsInString {

	public static void main(String[] args) {
		// duplicates char in string

		String name= "Jagadeesh";
		char a[] = name.toCharArray();
		
		for(int i=0; i<name.length();i++) {
			for(int j=i+1;j<name.length();j++) {
				
				if(a[i]==a[j]) {
					System.out.println(a[i]);
				
					break;
				}
			}
		}
		
	}
}
