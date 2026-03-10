package Interface;

public interface Calc {
	
	public void add();
	public void sub();

	default void mul(int a, int b){
		int c = a+b;
	}
	

}
