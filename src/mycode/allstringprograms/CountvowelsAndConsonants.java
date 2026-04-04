package mycode.allstringprograms;

public class CountvowelsAndConsonants {

    public static void main(String[] args) {
        String string = "helloworld";
        String vowels = "aeiou";

        for (char ch : string.toCharArray()) {
            if (vowels.contains(String.valueOf(ch))) {
                System.out.println(ch + " is vowel");
            } else {
                System.out.println(ch  + " is not vowel");
            }
        }

    }
}
