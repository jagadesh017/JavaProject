package mycode.allstringprograms;

import java.util.Arrays;

public class CommonCharInTwoStrings {
    public static void main(String[] args) {
        String s1 = "abcdefg";
        String s2 = "abcdegff";
        char ch1[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(Arrays.equals(ch1,ch2)){
            System.out.println("both are equal");
        }else{
            System.out.println("both are not equal");
        }


    }

}
