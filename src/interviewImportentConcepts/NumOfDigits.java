package interviewImportentConcepts;

public class NumOfDigits {
    public static void main(String[] args) {
        int num= 5678;
        int count=0;
      while(num!=0){
        num= num/10;
         count++;
      }
      System.out.println(" total number of digits are: "+count);
    }
    }


