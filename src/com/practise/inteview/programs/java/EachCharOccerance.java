package com.practise.inteview.programs.java;

import java.util.HashMap;
import java.util.Map;

public class EachCharOccerance {
    public static void main(String[] args) {
        
        String name ="jagadeesh";
        char []ch = name.toCharArray();
            Map<Character, Integer> map = new HashMap<>();

        for(Character c: ch){
            map.put(c, map.getOrDefault(c, 0)+1);

        }
        System.out.println(map);
        // print duplicates using hashmap

          for(Map.Entry<Character, Integer> entry : map.entrySet()){

        if(entry.getValue()==1){

            //System.out.println("duplicate char count is :"+entry.getValue()+ "and key is :" + entry.getKey());
            System.out.print(entry.getKey()+ ",");
        }

    }
    
    }

}
