package arraysConcepts.arryList;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableConcept {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
/*
*                    Hashmap             |         HashTable 
* it is not thread safe and unsybchronized|thread safe and synchronized
* It is fast | it is slow
* works with multiplethread at a time |  works with single thread at a time
* allows one null key&multiple null values | will not allow null key and values 
* iterator is used to iterate in hasmap|Enumurator is used to iterate the value hashtable
*/

		/*if you provide duplicate key value it will give you the new value of the list
		 * we can syncanized the hastable
		 * we can store data in key and value bases
		 * key-- object & hashcode---value
		 * not allow null key and null value
		 * not allow duplicate values
		 */
		Hashtable<Integer, String> h1 = new Hashtable<Integer, String>();
		h1.put(1, "Jagadeesh");
		h1.put(2, "keerthi");
		h1.put(3, "hrudhitha");
		h1.put(4, "hrudhitha");

		Hashtable<Integer, String> h2 = new Hashtable<Integer, String>();

		h2 = (Hashtable<Integer, String>) h1.clone();

		System.out.println("h1 obj data" + h1);
		System.out.println("h2 obj data" + h2);
		h1.clear();
		System.out.println("Now h1 data is:" + h1);
		System.out.println("now h2 data is:" + h2);

		// contains
		if (h2.containsValue("keerthi")) {
			System.out.println("value is displaying");
		} else {
			System.out.println("value is not displaying");
		}
		// print all values from hashtable using enumeration elements()

		Enumeration<String> e = h2.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

		// getting the all values from hashtable values using entry set of hastable
		// values

		Set<Entry<Integer, String>> s = h2.entrySet();
		System.out.println("printing values using entryset");
		System.out.println(s);

	}

}
