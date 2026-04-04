package oopsConcepts.hiraricalinheritance;

public class C extends A{

	public void mul() {
		System.out.println("this is mul method");
	}
	
	public static void main(String[] args) {
	
		C obj = new C();
		obj.add();
		obj.mul();
		
	}
	

}
