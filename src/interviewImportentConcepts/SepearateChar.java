package interviewImportentConcepts;

public class SepearateChar {
    public static void main(String[] args) {

        String input = "abc123def456!@#";

        StringBuilder digits = new StringBuilder();
        StringBuilder cha = new StringBuilder();
        StringBuilder spec = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
                char ch= input.charAt(i);
            if (Character.isDigit(ch)) {
                digits.append(ch);
            } else {
                if (Character.isLetter(ch)) {
                    cha.append(ch);
                } else {
                    spec.append(ch);
                }
            }
        }
        System.out.println(digits);
        System.out.println(cha);
        System.out.println(spec);

    }
}
