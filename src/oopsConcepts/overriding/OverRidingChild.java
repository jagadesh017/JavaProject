package oopsConcepts.overriding;

public class OverRidingChild extends OverRidingParent{

	public static void main(String[] args) {

		
		OverRidingChild obj = new OverRidingChild();
		obj.add(10, 15);
		obj.display();
		obj.keerthi();
		obj.show();
		obj.showmethod();
		//upcasting
		OverRidingParent obj1= new OverRidingChild();
		obj1.keerthi();
		obj1.show();

		//downcasting
		OverRidingChild obj2=(OverRidingChild) obj1;
		obj2.add(10, 10);
		obj2.display();
		obj2.show();
		obj2.keerthi();
		
	
	}

	public void display() {
		System.out.println("this is child class display method");
		
	}
	public void showmethod() {
		System.out.println("this is child class show method");
	}
	public void keerthi() {
		System.out.println("this is keerthi and i am from child class");
	}
	
	public void add(int a, int b) {
		int c = a + b;
		System.out.println("child c value is " + c);
	}
}

