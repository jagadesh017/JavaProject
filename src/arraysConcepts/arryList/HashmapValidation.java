package arraysConcepts.arryList;

import java.util.TreeMap;

public class HashmapValidation {

	public static void main(String[] args) {
		// it will store data in key and value format
		// need to use put key to data in key and value base
		
		
		//types in maps-Hashmap, treemap and linkedhashmap 
		//hashmap we will not get any order of the elements
		//Tree map will give you the result in ascending order based on key value,
		//not allows null key while executing=>will give you null point exception
		//Linedhasmap will give you the output in insertion order
		
		TreeMap<String , String > value = new TreeMap<String, String>();
		
		value.put("1234", "Jagadeesh");
		value.put("4567", "keerthi");
		value.put("5678", "hrudhitha");
		value.put("123", "Jagadeesh");
		//value.put(null, "123");
		value.put("key", null);
		//value.put(null, null);
		
		System.out.println(value);
		System.out.println(value.get("4567"));
	}

}
