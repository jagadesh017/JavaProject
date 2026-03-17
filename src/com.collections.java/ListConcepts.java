package com.collections.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListConcepts {

 
    public static void main(String[] args) {
    // list-> arrayList,LinkedList-->duplicates, add keyword
        List<String> value = new ArrayList<>();
        value.add("apple");
        value.add("banana");
        value.add("apple");
        value.add("mango");

        for(String a: value){
            System.out.println(a);
        }

        List<Integer> list1= new LinkedList<>();
        list1.add(100);
        list1.add(200);
        list1.add(100);
        list1.add(150);

        for(int i: list1){
            System.out.println(i);
        }
    }

}
