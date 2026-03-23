package com.practise.inteview.programs.java;

public class ReverseWords {
    public static void main(String[] args) {
        String name = "java is fun language";
        String words[]= name.split(" ");

        StringBuilder sb = new StringBuilder();

        for( int i=words.length-1; i>=0; i--){
           sb.append(words[i]).append(" ");
        }
        System.out.println(sb);
    }

}
