package oopsConcepts.singleinheritance;

public class Child extends Parent{
	
	public void sub() {
		System.out.println("this is sub method in child class");
	}

	public static void main(String[] args) {
		
		Parent ob= new Child(); // upcasting -- webdriver driver = new choromeDriver()
		ob.add();

		Child o = (Child) ob; // down casting -- JavaScriptExecutor js= (JavascriptExecutor)driver;
		o.add();
		o.sub();
	}
}
