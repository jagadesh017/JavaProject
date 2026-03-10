package constructor;

public class Student {

	public static void main(String[] args) {
		
		Student s= new Student(10, "jaga");
		s.studentMarks();
		
	}
	
	public Student() {
		System.out.println("welcome to School");
	}
	
	public Student(String a) {
		System.out.println("welcome to School mr: " + a);
	}
	
	public Student(int a) {
		System.out.println("welcome to School mr: " + a);
	}
	public Student(String a , int b) {
		System.out.println("welcome to School mr: " + a);
	}
	
	public Student(int b, String a) {
		System.out.println("welcome to School mr: " + a + ""+b);
	}
	
	public void studentMarks() {
		
		System.out.println("student got 80% in schooling");
	}

}
