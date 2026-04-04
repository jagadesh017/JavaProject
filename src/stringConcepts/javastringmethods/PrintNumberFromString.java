package stringConcepts.javastringmethods;

public class PrintNumberFromString {

	public static void main(String[] args) {
		String name ="JJag123 hello143 jaa111 jgr1";
		//print numbers
		String rel=name.replaceAll("[^0-9]", "");
		System.out.println(rel);
		//print letters
		String value= name.replaceAll("[^A-Z a-z]", "");
		System.out.println(value);
	}

}
