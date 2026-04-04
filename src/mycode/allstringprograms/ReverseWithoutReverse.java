package mycode.allstringprograms;

import java.util.Arrays;

public class ReverseWithoutReverse {
    public static void main(String[] args) {
        String name ="jagadeesh";
        char[] ch = name.toCharArray();
        String reverse = "";
        for (int i = name.length()-1; i>= 0; i--) {
            reverse = reverse + ch[i];
        }
        System.out.println(reverse);

    }
}
