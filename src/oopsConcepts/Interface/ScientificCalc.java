package oopsConcepts.Interface;

public class ScientificCalc implements Calc{ 

	
	
	public void scientificSin() {
		System.out.println("this is scientific sin method");
	}

	public void scientificCos() {
		System.out.println("this is scientific cos method");
	}

	public void add() {
		System.out.println("this is add method");
		
	}

	public void sub() {
		System.out.println("this is sub method");
	
	}
	
	public static void main(String[] args) {
		//child class ref and child class obj
		ScientificCalc cal= new ScientificCalc();
		cal.add();
		cal.sub();
		cal.scientificSin();
		cal.scientificCos();
		//
		Calc a= new ScientificCalc();
		
		a.add();
		a.sub();
		a.mul(10, 10);

	}
}
