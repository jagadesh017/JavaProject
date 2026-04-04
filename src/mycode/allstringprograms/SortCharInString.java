package mycode.allstringprograms;

import java.util.Arrays;

public class SortCharInString {


    public static void main(String[] args) {
        String name = "jagadeesh";
        char[] ch = name.toCharArray();

        Arrays.sort(ch);
        System.out.println(Arrays.toString(ch));


    }
}