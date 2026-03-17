package Javaprograms;

public class PrimeNumber {

	public static void main(String[] args) {
	
		int number=100;
		boolean value =false;
		
		for(int i=2; i<number;i++) {
			if(number%i==0) {				
				value= true;
				break;
			}
		}		
		if(value) {
			System.out.println("prime number");
		}else {
			System.out.println("not prime number");
		}
		
	}

}
