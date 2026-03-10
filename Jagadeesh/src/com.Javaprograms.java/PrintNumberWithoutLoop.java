package javatrickyprograms;

import java.util.stream.IntStream;

public class PrintNumberWithoutLoop {

	// Print 1 to 100 without using any loop
	//1. Recursive function
	//2. Java streams
	
	public static void main(String[] args) {
		//ptintNum(1);
		//ptintNumber(1,100);
		
		IntStream.range(1,101).forEach(e ->System.out.println(e));
	}
	
	public static void ptintNum(int num) {
		if(num<=100) {
			System.out.println(num); //1
			num++;
			ptintNum(num);
		}
	}
	public static void ptintNumber(int stnum,int endnum) {
		if(stnum<=endnum) {
			System.out.println(stnum); //1
			stnum++;
			ptintNumber(stnum,endnum	);
		}
	}
}
