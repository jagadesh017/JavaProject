package practise;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesStringChar {

    public static void main(String[] args) {
          String name ="test";
          int count =0;
Set<Character> set1 = new HashSet<>();
Set<Character> duplicates1 = new HashSet<>();
for(char c: name.toCharArray()){
    if(!set1.add(c)){
        duplicates1.add(c);
        count++;
    }
    }
    System.out.println(count);
}
}