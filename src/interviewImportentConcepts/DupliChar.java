package interviewImportentConcepts;

import java.util.HashMap;
import java.util.Map;


public class DupliChar {
public static void main(String[] args) {
    String name ="jagade";
    Map<Character, Integer> map = new HashMap<>();

    for(char c: name.toCharArray()){
        map.put(c, map.getOrDefault(c, 0)+1);
    }
    System.out.println(map);

    for(Map.Entry<Character,Integer> entry : map.entrySet()){
        if(entry.getValue()>1){
            System.out.println(entry.getKey());
        }
    }
System.out.println("----------");






}
}
