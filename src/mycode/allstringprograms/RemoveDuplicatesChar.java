package mycode.allstringprograms;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesChar {

    public static void main(String[] args) {
        String str = "abcdefgacd";
        char[] arr = str.toCharArray();
            Map<Character, Integer> map = new HashMap<Character, Integer>();
            for(char c : arr){
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            for(Map.Entry<Character, Integer> entry : map.entrySet()){
                if(entry.getValue() > 1){
                    System.out.println(entry.getKey());
                }
            }
    }

}
