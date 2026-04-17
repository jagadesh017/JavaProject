package collectionsConcepts;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetConcepts {
    public static void main(String[] args) {
           
    //set-> it wil not allow duplicate values, we will use add keyword
    // HashSet- ascending order
    //LinkedHashset- insertion order
    // TreeSet- sorting order 
    // sortedSet-
    
    Set<String> value = new HashSet<>();
        value.add("apple");
        value.add("banana");
        value.add("apple");
        value.add("mango");

        for( String a: value){
            System.out.println(a);
        }
        Set<Integer> list1= new TreeSet<>();
        list1.add(100);
        list1.add(200);
        list1.add(100);
        list1.add(50);

        for(int i: list1){
            System.out.println(i);
        }
    }
}
