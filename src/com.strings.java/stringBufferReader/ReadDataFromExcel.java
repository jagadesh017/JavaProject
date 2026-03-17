package stringBufferReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br=  new BufferedReader(isr);
		
		System.out.println("Enter name");
		String name = br.readLine();
		System.out.println("name is " + name);
		
	}

}
