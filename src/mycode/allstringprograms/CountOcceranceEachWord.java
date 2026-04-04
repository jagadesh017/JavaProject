package mycode.allstringprograms;

import java.util.HashMap;
import java.util.Map;

public class CountOcceranceEachWord {

    public static void main(String[] args) {
        String name ="let's continue for the next session in the same meeting hall and same topic";
        String words[] = name.split(" ");
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(String word : words){
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
    }

}
