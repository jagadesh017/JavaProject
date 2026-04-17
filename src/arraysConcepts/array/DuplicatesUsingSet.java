package arraysConcepts.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicatesUsingSet {

    public static void main(String[] args) {
        int []a= {1,2,3,4,4,3,2};
        Set<Integer>set = new HashSet<>();

        for(int s:a){
        if(!set.add(s)){
            System.out.println(s);
        }
        }

        Map<Integer, Integer> charCountMap = new HashMap<>();

        for(int c : a){
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : charCountMap.entrySet()){
            if(entry.getValue() >=1){
                System.out.println("Duplicate element: " + entry.getKey() + ", Count: " + entry.getValue());
            }
        }
    }
}
