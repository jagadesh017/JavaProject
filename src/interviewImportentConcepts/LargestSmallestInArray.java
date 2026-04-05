package interviewImportentConcepts;

public class LargestSmallestInArray {
public static void main(String[] args) {
    
int[] arr = {12, 5, 78, 1, 45, 99, 23};
int smallest = arr[0];
int largest = arr[0];

for(int i=0; i<arr.length;i++){
    if(arr[i]>largest){
        largest = arr[i];
    } else 
        if(arr[i]<smallest){
            smallest= arr[i];
        }
}

System.out.println(smallest);
System.out.println(largest);
}
}
