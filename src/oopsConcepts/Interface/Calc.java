package oopsConcepts.Interface;

public interface Calc {
	
	public void add();
	public void sub();

	default void mul(int a, int b){
		int c = a+b;
		System.out.println("this is mul method " +c);
	}
}
