package filereading;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferReader {
public static void main(String[] args) throws IOException {

    //readLine- current line
    //nextLine-- next line 
    //Bufferedreader -- for reading txt file data
    //BufferedWriter -- for write text data
    //write-- to write text in txt file

    BufferedWriter writer = new BufferedWriter(new FileWriter("D:/exp1.txt"));
    writer.write("selenium");
    writer.newLine();
    writer.write("automation");
    writer.close();
    System.out.println("closed file successfully");

            BufferedReader br = new BufferedReader(new FileReader("D:/test/exp1.txt"));
             {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("Read data is : "+line);
            }
        
        }

}
}
