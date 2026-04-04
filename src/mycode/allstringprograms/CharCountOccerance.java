package mycode.allstringprograms;

import java.util.HashMap;
import java.util.Map;

public class CharCountOccerance {

    public static void main(String[] args) {
        String str = "hello world";

        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(Character ch : str.toCharArray()){
            map.put(ch,map.getOrDefault(ch, 0)+1);
        }
        System.out.println(map);

}
}
