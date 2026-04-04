package oopsConcepts.constructor;

public class Marks {
	
	int result;
	public static void main(String[] args) {
		
		Marks m= new Marks(99);
		m.studentMarks();
	}
	
	public Marks(int marks) {
		result=marks;
	}
	public void studentMarks() {
		System.out.println("stundent marks are :" +result);
	}
}
