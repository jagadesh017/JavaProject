package basicJavaProg;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class practise {
	// prime number
	// reverse and palendrome
	// repeted letters in string
	public static void main(String[] args) {
		
		Map<String , String > data = new HashMap<String, String>();
		data.put("jagadeesh", "123346");
		data.put("keethi", "826438");
		data.put("hrudditha", "7297329");
		data.put("ali", "739274932");
		data.put(null, null);
		data.put("baba", null);	
		
			Set<String> value = 	data.keySet();
			for(String a: value) {
				System.out.println(a + ":" + data.get(a));
			}
			
			Set<Map.Entry<String, String>> val = data.entrySet();
			for(Map.Entry<String, String> b:val) {
				System.out.println(b.getKey()+ ":" + b.getValue());
			
				
			}
			
	}
		}
