package interviewImportentConcepts;

public class EvenOrOddCountInArray {
public static void main(String[] args) {
   int[]array = {10,20,30,50,40,41};
   int oddCount=0;
   int evenCount=0;

   for(int i=0; i<array.length; i++){
    if(array[i]%2==0){
        evenCount++;
    }else{
        oddCount++;
    }
   }
   System.out.println(evenCount);
   System.out.println(oddCount);

}
}
