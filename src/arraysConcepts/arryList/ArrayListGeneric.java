package arraysConcepts.arryList;

import java.util.ArrayList;

public class ArrayListGeneric {

	public static void main(String[] args) {
		
		ArrayList< String> value = new ArrayList<String>();
		
		value.add("jagadeesh");
		value.add("keerthi");
		value.add("keerthi");
		
		for(String a:value)
			System.out.println(a);

	ArrayList<Integer> v1=new ArrayList<Integer>();

	v1.add(23);
	v1.add(35);
	v1.add(56);
	v1.add(56);
	v1.remove(1);
	for(Integer b:v1) 
		System.out.println(b);
		
	}
}
