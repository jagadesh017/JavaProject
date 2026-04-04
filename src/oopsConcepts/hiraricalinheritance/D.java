package oopsConcepts.hiraricalinheritance;

public class D extends A{


	public void div() {
		System.out.println("this is div method");
	}
	
	public static void main(String[] args) {
		
		D obj = new D();
		
		obj.add();
		obj.div();
	}
}

