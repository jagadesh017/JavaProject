package javastringmethods;


public class Palendrome {

	public static void main(String[] args) {
		 
		
		String name="malayalam";
		String newvalue="";
		
		for(int i=name.length()-1; i>=0; i--) {
			
			newvalue = newvalue + name.charAt(i);
			
		}
		System.out.println(newvalue);
		
		if(newvalue.equals(name)) {
			System.out.println("the give string is palendrome  " + newvalue);
			
		}else {
			System.out.println("the give string is not palendrome" + newvalue);
		}
		
		
	}
}

// for(initialization; condition; inc/dec)