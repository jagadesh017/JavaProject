package arryList;

import java.util.HashMap;
import java.util.Map;

public class HashMapValidation2 {

	public static void main(String[] args) {

		HashMap<String, String> value = new HashMap<String, String>();

		value.put("1234", "Jagadeesh");
		value.put("4567", "keerthi");
		value.put("5678", "hrudhitha");
		value.put("123", "Jagadeesh");
		value.put("123","Jagadesh");
		//System.out.println(value);
		
		for(Map.Entry<String, String> a: value.entrySet()) {
			
			System.out.println(a.getKey());
			System.out.println(a.getValue());
		
		
		}

	}
}
