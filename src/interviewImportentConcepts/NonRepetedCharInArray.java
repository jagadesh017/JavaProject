package interviewImportentConcepts;

import java.util.HashMap;
import java.util.Map;

public class NonRepetedCharInArray {

    public static void main(String[] args) {
        
        int[] array = {1, 1, 2, 2, 3, 4, 5, 5, 6, 6};
        Map<Integer,Integer> map = new HashMap<>();
        for( int a: array){
            map.put(a, map.getOrDefault(a, 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){

            if(entry.getValue()==1){
                System.out.println(entry.getKey());
            }
        }
    }
}
