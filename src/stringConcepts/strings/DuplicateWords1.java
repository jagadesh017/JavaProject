package stringConcepts.strings;

import java.util.*;

public class DuplicateWords1 {
    public static void main(String[] args) {
        String input = "I love cookies cookies and apples and pancakes pancakes";

        String []words = input.split(" ");

        Map<String, Integer> map = new LinkedHashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
}
}