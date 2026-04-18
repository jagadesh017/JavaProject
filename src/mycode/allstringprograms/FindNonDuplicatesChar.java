package mycode.allstringprograms;

import java.util.HashMap;
import java.util.Map;

public class FindNonDuplicatesChar {

    public static void main(String[] args) {
        String name = "hello";
        Map<Character, Integer> map = new HashMap<>();
      for(char c : name.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
          }
            for(Map.Entry<Character, Integer> entry : map.entrySet()){
                if(entry.getValue() == 1){
                    System.out.println(entry.getKey());
                }
            }
        }
}
