package overloading;

public class OverLoading {

	public static void main(String[] args) {
		// all so know as compile runtime or early binding
		// method name is same but aruguments are different
		OverLoading ol = new OverLoading();
		
		ol.add(10, 20);
		ol.add(10, 20, 30);
		ol.add(10.0, 10.5);
		ol.add(10.5, 20);
		ol.add(10, 20.5);
		
	}

	public void add(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}

	public void add(int a, int b, int d) {
		int c=a+b+d;
		System.out.println(c);
	}
	public void add(double a, double b) {
		double c= a+b;
		System.out.println(c);
	}
	public void add(int a, double b) {
		double c= a+b;
		System.out.println(c);
	}
	public void add(double a, int b) {
		double c= a+b;
		System.out.println(c);
	}
}