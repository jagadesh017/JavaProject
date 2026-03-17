package com.practise.inteview.programs.java;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriter {
    public static void main(String[] args) throws IOException{
        
   String path = "/Users/jagadeesh/Documents/myNewFile.txt";


            BufferedWriter bw = new BufferedWriter(new java.io.FileWriter(path));
            PrintWriter out = new PrintWriter(bw);
       
            out.println("Line 1: Hello from Java!");
            out.println("Line 2: This is a Mac plain text file.");
            out.println("Line 3: 12345");
            out.close();
            System.out.println("Successfully wrote to: " + path);
    
    }

}
