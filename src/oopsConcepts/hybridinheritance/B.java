package oopsConcepts.hybridinheritance;

public class B extends A implements D{
	
	public void sub() {
		System.out.println("this is sub method");
	}

	public void mul() {
		System.out.println("this is mul method");
		
	}

	public void div() {
		System.out.println("this is div method");
		
	}

	public static void main(String[] args) {
		
		B obj = new B();
		obj.add();
		obj.sub();
		obj.div();
		obj.mul();
		
		
		
		
	}
	

}
