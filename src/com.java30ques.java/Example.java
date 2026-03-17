package com.java30ques.java;

public class Example {
    public static void main(String[] args) {
        String name ="LavanyaDhanush";

        StringBuilder upperchar = new StringBuilder();
        StringBuilder lowerchar = new StringBuilder();
        int upperCharCount = 0;
        int lowerCharCount = 0;
       char ch[]= name.toCharArray();

       for(Character c:ch){
        if(Character.isUpperCase(c)){
            upperchar.append(c);
            upperCharCount++;
        }     else if(Character.isLowerCase(c)){
            lowerchar.append(c);
            lowerCharCount++;
        }
       }
        System.out.println(upperchar +" and count is "+upperCharCount);
       System.out.println(lowerchar + " and count is "+lowerCharCount);
    }
}
