package interviewImportentConcepts;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromExcel {

    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new FileReader("/Users/jagadeesh/exp.txt"));
        String file;
        while((file= br.readLine())!= null){
            System.out.println(file);
        }

    }

}
