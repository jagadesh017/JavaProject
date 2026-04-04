package mycode.allstringprograms;

import java.util.HashSet;
import java.util.Set;

public class FindFirstNonDuplicateChar {

    public static void main(String[] args) {
        String name = "testing";
        Set<Character> set = new HashSet<>();
        for(char c : name.toCharArray()){
            if(set.add(c)){
                System.out.println(c);
                break;
            }
        }
    }

}
