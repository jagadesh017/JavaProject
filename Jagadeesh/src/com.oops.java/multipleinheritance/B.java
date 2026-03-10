package multipleinheritance;

public class B extends A implements C{
	
	public void sub() {
		System.out.println("this is sub method");
	}

	public void mul() {
		System.out.println("this is mul method");
		
	}

	public static void main(String[] args) {
		
		B obj =new B();
		
		obj.add();
		obj.sub();
		obj.mul();
	}

}
