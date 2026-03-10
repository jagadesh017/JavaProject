package strings;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateWords {
    public static void main(String[] args) {
        
    
    String input = "I love cookies cookies apples and pancakes pancakes";
String result = Arrays.stream(input.split(" ")).distinct().collect(Collectors.joining(" "));
System.out.println(result);
System.out.println("------------------------");

String auto = "jagadeesshh";
char ch[]= auto.toCharArray();
Set<Character> charSet = new LinkedHashSet<>();
for (char c : ch) {
    charSet.add(c); 
     
}

StringBuilder sb = new StringBuilder();
for (Character cr : charSet) {
    sb.append(cr);
}
System.out.println(sb);

}
}