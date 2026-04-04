package practise;

import java.util.Arrays;

import org.testng.annotations.Test;

public class Anagram {
    
    @Test
    public static char[] anagramMethod(String name){

        char c[] = name.toCharArray();
    Arrays.sort(c);
    return c;
    }
    public static void main(String[] args) {
        
        char []newone =anagramMethod("hello");
        char []new1=anagramMethod("silent");

        if(Arrays.equals(newone, new1)){
            System.out.println("anagram");
        }
else{
    System.out.println("not anagram");
}    
}   
} 