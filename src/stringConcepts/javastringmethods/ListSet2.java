package stringConcepts.javastringmethods;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListSet2 {
	public static void main(String[] args) {
// list can allow duplicate values
// it is not in order		
		List<String> list = new ArrayList<String>();
		list.add("jagadeesh");
		list.add("kim");
		list.add("apple");
		list.add("kim");

		for (String a : list) {
			System.out.println(a);
		}
		System.out.println();
// set can provide data in ascending order
		// set can not allow duplicate values
		Set<String > set =  new TreeSet<String>();
		
		set.add("jagadeesh");
		set.add("kim");
		set.add("apple");
		set.add("apple");
		
		for(String b:set) {
			System.out.println(b);
		}
	}
}
