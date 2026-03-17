package strings;

public class StringConcepts1 {

    public static void main(String[] args) {
        String auto ="automation";
        String rev ="";

        for( int i=auto.length()-1; i>=0; i-- ){
            rev= rev+ auto.charAt(i);
        }
        System.out.println(rev);
    
    int n = 5678;
    int revs =0;
    while (n!=0) {
        int d= n%10;
        revs= revs*10+ d;
        n=n/10;
        
    }System.out.println(revs);
   
  /*  int a=500;
    int sum=0;
    while (n!=0) {
        sum = sum+ n%10;
        n= n/10;
    }
    System.out.println(sum); */
}
}