package stringConcepts.strings;

public class StringConcepts1 {

    public static void main(String[] args) {
        String auto ="automation";
        String rev ="";

        for( int i=auto.length()-1; i>=0; i-- ){
            rev= rev+ auto.charAt(i);
        }
        System.out.println(rev);
    
    int number = 5678;
    int revs =0;
    while (number!=0) {
        int remainder= number%10;
        revs= revs*10+ remainder;
        number=number/10;
    }
    System.out.println(revs);
   //sum of digits in a number
  int a=5050;
    int sum=0;
    while (a!=0) {
        sum = sum+ a%10;
        a= a/10;
    }
    System.out.println(sum);
}
}