package arraysConcepts.arryList;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashmapValidation3 {
	public static void main(String[] args) {
		
	
	
	HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		
		hmap.put(1, "hello");
		hmap.put(3, "world");
		hmap.put(2, "am jagaddesh");
		hmap.put(null, "jeeva");
		hmap.put(null, null);
		System.out.println(hmap);
		
		for(Map.Entry<Integer, String> m : hmap.entrySet()) {
			
			//System.out.println(m);
			System.out.println("key is :"+m.getKey() +" and value is: " + m.getValue());
		}
		
		// calling data from employee class
		HashMap<Integer, Employee > emp = new HashMap<Integer, Employee >();
		
		Employee e1= new Employee("Jagadeesh", 1232, 30);
		Employee e2= new Employee("keerthi", 1235, 29);
        Employee e3= new Employee("Hrudhitha", 1234, 10);
		Employee e4= new Employee("Jeeva", 1236, 50);
		
		emp.put(1, e1);
		emp.put(3, e2);
		emp.put(2, e3);
		emp.put(4, e4);
		
		//travese the hasmap
		for(Entry <Integer, Employee> s: emp.entrySet()) {
			int value=s.getKey();
			Employee details=s.getValue();
			
			System.out.println(value +"info");
			System.out.println(details.name +" "+details.empId + " " +details.salary);
		}
}
}