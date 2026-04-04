package mycode.allstringprograms;

import java.util.Arrays;

public class SortWords {
    public static void main(String[] args) {
        String name ="hello world welcome to java programming";
        String[] words = name.split(" ");
        for(String word : words){
          char []c=  word.toCharArray();
          Arrays.sort(c);
          System.out.println(Arrays.toString(c));
        }
    }

}
