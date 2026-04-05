package interviewImportentConcepts;

import java.util.HashSet;
import java.util.Set;


public class RemoveDuplicInArray {
public static void main(String[] args) {
    
    int[] array = {5, 2, 9, 1, 6, 2, 5};

    Set<Integer> set = new HashSet<>();
    Set<Integer> dupli= new HashSet<>();

    for(int i : array){
        if(!set.add(i)){  
            dupli.add(i);     
        }       
    }
    System.out.println(dupli);
}
}
