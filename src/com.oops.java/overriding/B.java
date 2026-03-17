package overriding;

public class B extends A{
	
	public void price(int iphone15) {
		System.out.println(iphone15 +"rs from B class");
		System.out.println(" we got price from a ");
		super.price(iphone15);
	}

}
