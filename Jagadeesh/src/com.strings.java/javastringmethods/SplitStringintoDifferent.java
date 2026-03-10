package javastringmethods;

public class SplitStringintoDifferent {

	public static void main(String[] args) {
	
		String a ="java,selenium,jenkins,oops";
		String b = "xy";
		String c= "abc";
		
		StringBuffer sb= new StringBuffer(a);
		sb.append(b);
		sb.append(c);
		System.out.println(sb);
		
		String va= a+b+c;
		System.out.println(va);
		String val= a.concat(b);
		String val2= val.concat(c);
		System.out.println(val2);
		
		String x[]= a.split(",");

		for(String y:x ) {
			System.out.println(y);
		}
	}

}
