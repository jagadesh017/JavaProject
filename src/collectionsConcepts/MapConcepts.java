package collectionsConcepts;

import java.util.HashMap;
import java.util.Map;


public class MapConcepts {
    public static void main(String[] args) {
        //Map->HashMap,LinkedHashMap,TreeMap,HashTable

        Map<Integer, String> value = new HashMap<>();
        value.put(1, "apple");
        value.put(4, "banana");
        value.put(3, "apple");
        value.put(1, "mango");
    
        for(Map.Entry<Integer, String> va: value.entrySet()){
            System.out.println(va.getKey() + " and " +va.getValue());
        }


       // 









    }
}
