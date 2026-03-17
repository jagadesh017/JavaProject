package inheritance;

public class ChildClass extends Baseclass{
	public static void main(String[] args) {
		//child class ref and obj
		ChildClass c= new ChildClass();
		c.add();
		c.sub();
		c.mul();
		c.div();
		// parent class obj and ref
		Baseclass a= new Baseclass();
		a.add();
		a.sub();
		//parent obj and child ref  upcasting
		Baseclass b= new ChildClass();
		b.add();
		b.sub();
		
		//downcasting
		
		ChildClass d= (ChildClass) b;
		d.add();
		d.sub();
		d.mul();
		d.div();
		
		//child obj and parent class: it will not allow in java
		
		
	}
	public void div() {
		System.out.println("am in child class div method");
	}
	public void mul() {
		System.out.println("am in child class mul method");
	}
}
