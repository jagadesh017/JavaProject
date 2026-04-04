package mycode.allstringprograms;

import java.util.HashSet;
import java.util.Set;

public class FindFirstDuplicateChar {

    public static void main(String[] args) {
        String string = "helloworld";
        char ch[] = string.toCharArray();

        Set<Character> duplicateChar = new HashSet<Character>();

       for(char c: ch){
          if(!duplicateChar.add(c)){
              System.out.println(c);
              break;
          }
       }
    }

}
