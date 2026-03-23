package com.practise.inteview.programs.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWord {

public static void main(String[] args) {
    
    String name ="selenium with java";

    String splitName[]= name.split(" ");
    String rev ="";

    for(int i=splitName.length-1; i>=0;i--){

        rev = rev+ splitName[i]+ " ";
    }
    System.out.println(rev);

    List<String> splitValues = Arrays.asList(name.split("\\D+"));
    Collections.reverse(splitValues);
        String results = String.join(" ", splitValues);

    System.out.println(results);

}

}
