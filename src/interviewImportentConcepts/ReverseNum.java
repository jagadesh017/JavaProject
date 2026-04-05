package interviewImportentConcepts;

public class ReverseNum {
    public static void main(String[] args) {
        
        int number= 5678;
        int remainder;
        int reverse=0;
       
        while(number>0){
           remainder= number%10;

        //reverse = reverse *10+ remainder; // for reverse number
        reverse+= remainder; // sum of numbers
          number= number/10;
        }
        System.out.println(reverse);
    }

}
