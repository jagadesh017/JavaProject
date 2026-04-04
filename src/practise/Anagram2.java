package practise;

import java.util.Arrays;

import org.junit.Test;

public class Anagram2 {

    @Test
    public static char[] sort(String name){

        char c[]= name.toCharArray();
        char temp;

        for(int i=0; i<name.length(); i++){
            for(int j=i+1; j<name.length();j++){

                if(c[i]>c[j]){
                    temp =c[i];
                    c[i]=c[j];
                    c[j]= temp;
                }
            }
        }
return c;
    }
    public static void main(String[] args) {
        
        char ch[]=sort("listen");
        char ch1[] = sort("silent");
 if (Arrays.equals(ch1, ch)) {
    System.out.println("ana");
    
 }else{
    System.out.println("not ana");
 }

    }
}