package basic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test {
public static void main(String[] args) {
    

    String name = "keerthik";
char c[] = name.toCharArray();

for (int i = 0; i < c.length; i++) {
    boolean isAlreadySeen = false;
    boolean hasFutureDuplicate = false;

    // 1. Check if we already processed this character earlier
    for (int k = 0; k < i; k++) {
        if (c[i] == c[k]) {
            isAlreadySeen = true;
            break;
        }
    }
    
    // If seen before, skip it to avoid printing the same char twice
    if (isAlreadySeen) continue;

    // 2. Check if this character appears again later in the string
    for (int j = i + 1; j < c.length; j++) {
        if (c[i] == c[j]) {
            hasFutureDuplicate = true;
            break;
        }
    }

    if (hasFutureDuplicate) {
        System.out.println("duplicates : " + c[i]);
    } else {
        System.out.println("non dupli : " + c[i]);
    }
}
//------------------------------

String name1 = "aabbacc";

Set<Character>  charcters= new HashSet<>();
Set<Character> duplicates = new HashSet<>();

for(Character ch: name1.toCharArray()){

    if(!charcters.add(ch)){   
    duplicates.add(ch);
}
}
System.out.println(duplicates);
//------------------------

Map<Character, Integer> duMap= new HashMap<>();

for(Character ch: name1.toCharArray()){

    duMap.put(ch, duMap.getOrDefault(ch , 0)+1);

}
for(Map.Entry<Character, Integer> value : duMap.entrySet()){
    if(value.getKey()>1){
        System.out.println("the repeted values are : " +value.getKey() + "="+value.getValue());
    }
}
//---------------------------
//2nd largest number in array 
    int arr[] = {10,15,5,20,30,25};

    int largest = arr[0];
    int secondLargest= arr[0];

    for( int num : arr){
        if(num>largest){
            secondLargest = largest;
            largest = num;
        } else if( num> secondLargest && num != largest){
            secondLargest = num;
        }
    }
System.out.println("second largest number is : " + secondLargest);
//---------------
Arrays.sort(arr);
System.out.println(arr[arr.length-2]);
//----------------- sort the array values 
int temp=0;
for( int i=0; i<arr.length;i++){
    for(int j=i+1; j<arr.length;j++){
    if(arr[i]==arr[j]){
        temp = arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }
}
}
//System.out.println(Arrays.toString(arr));
for( int k=0; k<arr.length;k++){
    System.out.println(arr[k]);
}
//-----------------------
int[] a = {1, 2, 2, 3,5,5,5,5,4};

Map<Integer, Integer> map = new HashMap<>();

for( int v: a){
    map.put(v, map.getOrDefault(v, 0)+1);
}
System.out.println(map);

}
}
