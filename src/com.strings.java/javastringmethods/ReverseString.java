package javastringmethods;

public class ReverseString {
	public static void main(String[] args) {

		String name = "Jagadeesh";
		String reverse = "";

		int value = name.length();

		for (int i = value - 1; i >= 0; i--) {
			reverse = reverse + name.charAt(i);
		}
		System.out.println(reverse);

		if (reverse.equals(name)) {
			System.out.println("palendrome");
		} else {
			System.out.println("not palendrome");
		}

		int i = 5678;
		String data = String.valueOf(i);
		String rev = "";

		for (int k = data.length() - 1; k >= 0; k--) {
			rev = rev + data.charAt(k);
		}
		System.out.println(rev);

	}
}