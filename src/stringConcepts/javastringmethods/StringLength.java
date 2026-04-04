package stringConcepts.javastringmethods;

public class StringLength {

	public static void main(String[] args) {
	
		String name = " Jagadeesh Keerthi ";
		String name2 = "JagadeeshKeerthi1";
		String name3 = "Jagadeesh 123 Keerthi 456 hrudhitha 789";
		String val1="1234";
		String val2="1234";
		
		int length=name.length();
		System.out.println(length);
		
		String space= name.trim();
		System.out.println(space);
		System.out.println(space.length());
		
		String name1=name.replace(" ", "");
		//System.out.println(name1);
		if(name1.equals(name2)) {
			System.out.println("both strings are same");
			
		}else {
			System.out.println("both strings are different");
		}
		
		//lower case and upper case
		String low=name.toLowerCase();
		String upp=name.toUpperCase();
		System.out.println(low);
		System.out.println(upp);
		
		//char at position ?
		char poss=name2.charAt(0);
		System.out.println(poss);
		
		//replace data
		
		String newvalue=name2.replace('e', 'K');
		System.out.println(newvalue);
		
		String value1=name3.replaceAll("[^0-9]", "");	
		System.out.println(value1);
		
		String value2 =name3.replaceAll("[^A-Z, ^a-z]", "").replace(" ", "");
		System.out.println(value2);
		String name4=  name2+name3;
		System.out.println(name4);
		System.out.println(val1+val2);
		
		//string exist in another string
		
		if(name2.contains("Keerthii")){
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		
		//split string
		
		String []splitvalue = name3.split(" ");
		
		for(String v: splitvalue) {
			System.out.println(v);
		}
		
		//palendrome
		
		String pale="malayalam";
		String reverse="";
		for(int i=pale.length()-1;i>=0;i--) {
			reverse= reverse + pale.charAt(i);
			}
			if(reverse.equals(pale)) {
				System.out.println("palendrome");
			}else {
					System.out.println("not palendrome");
				}
			}
			
}