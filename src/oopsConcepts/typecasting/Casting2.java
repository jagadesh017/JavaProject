package oopsConcepts.typecasting;

public class Casting2 extends Casting{
	
	
	public void div(int a, int b) {
		
		int c = a/b;
		System.out.println(c);
	}
	public void mul(int a, int b) {
		int c= b*a;
		
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		//upcasting
		Casting c= new Casting2(); 
		c.add(10, 10);
		c.sub(10, 10);
		
		//down casting
		
		Casting2 c2= (Casting2) c;
		c2.add(1, 1);
		c2.sub(2, 2);
		c2.mul(5, 5);
		c2.div(5, 5);
		
		
		
		
		
		
	}

}
