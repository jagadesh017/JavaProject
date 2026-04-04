package stringConcepts.strings;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class CountOccurance {

    public static void main(String[] args) {
        
        String name="testings";
        char ch[]= name.toLowerCase().toCharArray();

        Map<Character, Integer> map= new LinkedHashMap<>();
        
        for(Character c: ch){

            map.put(c, map.getOrDefault(c,0 )+1);

        }
        System.out.println(map);


        String a= "aabbcc";
        char ct[] =a.toCharArray();
        Set<Character> set = new LinkedHashSet<>();

        for( Character car: ct){
            set.add(car);
        }
        StringBuilder sb= new StringBuilder();
        for( Character can: set){
            sb.append(can);
        }
System.out.println(sb.toString());
// Check if two Strings are Anagrams
            String one = "silent";
            String two = "listent";

            char ch1[]= one.toCharArray();
            char ch2[] = two.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);
            Boolean isBothEqual= Arrays.equals(ch1, ch2);
            System.out.println(isBothEqual);
// revese two words in strings
        String z= "Java is fun";
        String r= "";
        String z1[]=z.split(" ");
        for( String s:z1){
        StringBuilder sb1= new StringBuilder(s);
        r= r+sb1.reverse().toString() + " " ;
        }

        System.out.println(r);



    }
    public static void main1(String[] args) {
        // print only numbers in the string
String j= "124hello456world";
String j1[]= j.split("[^0-9]");
int sum=0;
for(String k:j1){
    sum = sum + Integer.parseInt(k);
}
System.out.println(sum);
    }
}