package com.practise.inteview.programs.java;

import java.io.BufferedReader;
import java.io.IOException;

public class FileReader {

    public static void main(String[] args) throws IOException{
        

        BufferedReader br = new BufferedReader(new java.io.FileReader("/Users/jagadeesh/Documents/myNewFile.txt"));

        String line;
        String exp="Mac";

        while((line = br.readLine()) !=null){
            if(line.contains(exp)){
            System.out.println(line);
        }
        }
    }
}
