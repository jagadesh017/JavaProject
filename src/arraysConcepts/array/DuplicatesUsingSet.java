package arraysConcepts.array;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesUsingSet {

    public static void main(String[] args) {
        int []a= {1,2,3,4,4,3,2};

        Set<Integer>set = new HashSet<>();
    for (int s:a){
        if(!set.add(s)){
            System.out.println(s);
        }
        }
    }
}
