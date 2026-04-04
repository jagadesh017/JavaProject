package arraysConcepts.arryList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArryListOperations {

	public static void main(String[] args) {

		ArrayList value = new ArrayList();

		value.add("jagadeesh");
		value.add("keerthi");
		value.add(912739427);
		value.add('G');
		value.add(89.99);
		value.add("keerthi");

		
		 int val=value.size(); for(int i=0; i<val;i++) {
		  System.out.println(value.get(i));
		 

		Iterator itr = value.iterator();
		 while (itr.hasNext()) 
		 { 
			 Object valu = itr.next(); 
			 System.out.println(valu); }
		 
	}
}
}