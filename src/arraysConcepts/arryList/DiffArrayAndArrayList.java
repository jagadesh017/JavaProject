package arraysConcepts.arryList;

import java.util.ArrayList;

public class DiffArrayAndArrayList {
	public static void main(String[] args) {
		// Array | ArrayList
		// size should be given at the time of array declaration | size may not be required
		// Dynamically changed
		// To put object into an array we need to specify the index | no need to mention
		// not parameterized  | parameterized. by using 'add' key we can add data in to arraylist
		
		ArrayList< String > data = new ArrayList<String>();
		data.add("jagadeesh");
		data.add("keer");
		data.add(null);
		data.add(null);
		System.out.println(data);
 	}

}
