package oopsConcepts.multiilevelnheritance;

public class C extends B{

	public void mul() {
		System.out.println("this is mul method");
	}
	
	public static void main(String[] args) {
		
		C obj = new C();
		
		obj.add();
		obj.sub();
		obj.mul();
	}
}
