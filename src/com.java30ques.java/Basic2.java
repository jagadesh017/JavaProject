package java30ques;

import java.util.HashMap;
import java.util.Map;

public class Basic2 {
    
        public static void main(String[] args) {
            
        //occuring of each char
        String ap = "apple";
        Map< Character, Integer> map = new HashMap<>();
        
        for(Character ch: ap.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        System.out.println(map);

        int a=100;
        int b=200;

        a= a+b; // 300
            b=a-b; //300-200=100
               a=a-b;     //300-100=200
               System.out.println("a value is :"+a + " b value is: " +b);


    }

}
