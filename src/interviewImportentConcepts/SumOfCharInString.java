package interviewImportentConcepts;

public class SumOfCharInString {
    public static void main(String[] args) {
        String str = "abc123def456";
        int sum=0;

        for(int i =0; i<str.length();i++){

           char ch= str.charAt(i);

           if(Character.isDigit(ch)){
            
            sum = sum + Character.getNumericValue(ch);
           }
        }
        System.out.println(sum);


    }

}
