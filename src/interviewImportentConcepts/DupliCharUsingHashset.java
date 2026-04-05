package interviewImportentConcepts;

import java.util.HashSet;
import java.util.Set;

public class DupliCharUsingHashset {

    public static void main(String[] args) {
    String name = "jagadeesh";
    char ch[] = name.toCharArray();

    Set<Character> set = new HashSet<>();
    Set<Character> duplicates= new HashSet<>();

    for(char c: ch){
        if(!set.add(c)){
            duplicates.add(c);   
        }
    }
System.out.println(duplicates);

    }
}

