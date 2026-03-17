package com.practise.inteview.programs.java;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesInArray {

    public static void main(String[] args) {
        int arr[] = {10,5,10,15,20,15 };
       

// print only duplicates
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplictes = new HashSet<>();

        for(int a: arr){

            if(!set.add(a)){
                    duplictes.add(a);
            }
        }
System.out.println(set);
System.out.println(duplictes);

    }
}