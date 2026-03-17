package javastringmethods;

public class DuplicatesInString {

	public static void main(String[] args) {

		String name = "jagadeeshh";
		int count = 0;
		char[] value = name.toCharArray();

		for (int i = 0; i < name.length(); i++) {

			for (int j = i+1; j < name.length(); j++) {

				if (value[i] == value[j]) {
					System.out.print(value[j]);
					
					count++;
					//break;
				}

					
			}
		}
	}

}
