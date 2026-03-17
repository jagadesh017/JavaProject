package com.practise.inteview.programs.java;

import java.util.Arrays;

import org.testng.annotations.Test;

public class Anagram {
    
    @Test

    public static char[] ana(String name){

        char c[] = name.toCharArray();

    Arrays.sort(c);
    return c;
    }
    public static void main(String[] args) {
        
        char []newone =ana("hello");
        char []new1=ana("silent");

        if(Arrays.equals(newone, new1)){
            System.out.println("anagram");
        }
else{
    System.out.println("not anagram");
}    }
    
    } 