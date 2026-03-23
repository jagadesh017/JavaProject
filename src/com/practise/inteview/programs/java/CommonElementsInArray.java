package com.practise.inteview.programs.java;

import java.util.HashSet;
import java.util.Set;

public class CommonElementsInArray {
    public static void main(String[] args) {
        
        int a[]={10,20,30,40,50};
        int b[]={15,20,25,30,35};

        Set<Integer> set = new HashSet<>();
        //Set<Integer> commonEle = new HashSet<>();

        for(int s: a){
            
            set.add(s);
        }
            for(int t:b){
                if(set.contains(t)){
                    System.out.print(set+",");
                }
            }
        }
    

}
