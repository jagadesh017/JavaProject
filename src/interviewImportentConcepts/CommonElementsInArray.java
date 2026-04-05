package interviewImportentConcepts;

import java.util.HashSet;
import java.util.Set;

public class CommonElementsInArray {
public static void main(String[] args) {
    int[] array1 = {1, 2, 3, 4, 5};
    int[] array2 = {4, 5, 6, 7, 8};

    Set<Integer> set = new HashSet<>();
    Set<Integer> commonEle= new HashSet<>();

    for(int i: array1){
        set.add(i);
        }
        for(int j : array2){
            //if(!set.add(j)){ 
            if(set.contains(j)){
                commonEle.add(j);
            }
    }
    System.out.println(commonEle);

}
}
