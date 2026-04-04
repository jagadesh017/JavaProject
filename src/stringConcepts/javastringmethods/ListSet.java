package stringConcepts.javastringmethods;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ListSet {
	public static void main(String[] args) {
// list can allow duplicate values
// it is not in order		
		List<Integer> list = new LinkedList<>();
		list.add(5);
		list.add(2);
		list.add(1);
		list.add(9);
		list.add(1);
		
		System.out.println(list.get(0));

		for (Integer a : list) {
			System.out.print(a);
		}
		System.out.println();
		
// set can provide data in ascending order
// set can not allow duplicate values
		Set<Integer > set =  new HashSet<>();
		set.add(5);
		set.add(1);
		set.add(9);
		set.add(1);
		
		for(int b:set) {
			System.out.print(b);
		}
	}
}
