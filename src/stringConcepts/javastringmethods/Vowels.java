package stringConcepts.javastringmethods;

public class Vowels {

	public static void main(String[] args) {
		
		String name = "keethi";
		char[] value = name.toCharArray();
			int count=0;
		for (int i = 0; i < value.length; i++) {

			if (value[i] == 'a' || value[i] == 'e' || value[i] == 'i' || value[i] == 'o' || value[i] == 'u') {

				System.out.println(value[i] + " is vowel");
				count++;
			}
			
			else {
				System.out.println(value[i] + " is not vowel");
			}
			
		}
		System.err.println(count);

	}

}
