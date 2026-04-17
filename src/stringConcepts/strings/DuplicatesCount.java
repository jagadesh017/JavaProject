package stringConcepts.strings;

import java.util.HashMap;
import java.util.Map;

public class DuplicatesCount {
    public static void main(String[] args) {

        String input = "jagadeesh";
        Map<Character, Integer> map = new HashMap<>();
        for (char c : input.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println(map);
        int duplicateCount = 0;
        int uniqueCount = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " is a duplicate character with count: " + entry.getValue());
                duplicateCount++;
            } else {
                System.out.println(entry.getKey() + " is a unique character with count: " + entry.getValue());
                uniqueCount++;
            }
        }
        System.out.println("\n--- Final Summary ---");
        System.out.println("Total Unique Characters: " + uniqueCount);
        System.out.println("Total Duplicate Characters (Sets): " + duplicateCount);
    }
}
