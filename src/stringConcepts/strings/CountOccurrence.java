package stringConcepts.strings;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class CountOccurrence {

    public static void main(String[] args) {

        String name="testings";
        char []ch= name.toLowerCase().toCharArray();
        Map<Character, Integer> map= new LinkedHashMap<>();

        for(Character c: ch){
            map.put(c, map.getOrDefault(c,0 )+1);
        }
        System.out.println(map);

        String a= "aabbcc";
        char []ct =a.toCharArray();
        Set<Character> set = new LinkedHashSet<>();

        for( Character car: ct){
            set.add(car);
        }
        System.out.println("set is "+ set);

        StringBuilder sb= new StringBuilder();
        for( Character can: set){
            sb.append(can);
        }
System.out.println(sb);

// Check if two Strings are Anagrams
            String one = "silent";
            String two = "listen";

            char []ch1= one.toCharArray();
            char []ch2 = two.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);
            Boolean isBothEqual= false;
            if( Arrays.equals(ch1, ch2)){
                isBothEqual= true;
            }
            System.out.println(isBothEqual);
    }
}