package basicJavaProg;

public class TypeCasting {
	
	public static void main(String[] args) {
		int a= 10;
		double b= 10.5;
		String c = "100";
		
	// from string to data type converstion	
	int d=	Integer.parseInt(c);
	double e = Double.parseDouble(c);
	long l = Long.parseLong(c);
	System.out.println(d);
	System.out.println(e);
	System.out.println(l);
	// to string converstion
	
	String s= String.valueOf(b);
	System.out.println(s);
	
}
}
