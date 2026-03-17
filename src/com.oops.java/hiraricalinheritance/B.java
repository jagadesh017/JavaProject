package hiraricalinheritance;

public class B extends A{

	public void sub() {
		System.out.println("this is sub method");
	}
	
	public static void main(String[] args) {
		B obj = new B();
		obj.add();
		obj.sub();
	}
}
