package java30InterviewQues;

import java.util.LinkedHashSet;
import java.util.Set;

public class Basic3 {
    public static void main(String[] args) {
        

        //print min and max value in the given array
        int array[]= {2,1,4,5,7,3};

        int min =array[0];
        int max = array[0];

        //for each loop
        for( int eachValue  : array){

            if(min>eachValue){  
            min=eachValue;

            }
            if(max<eachValue){
                max= eachValue;
            }
        }
        System.out.println(min);
        System.out.println(max);
//remove duplicate values in array
int[] arr = {1, 2, 2, 3, 3};

Set<Integer> map = new LinkedHashSet<>();

        for(int a: arr){
            map.add(a);
        }
        System.err.println(map);
//check prime num
int num = 6;

boolean isPrime =false;

for(int i=2; i<num; i++){
    if(num%i==0){
        isPrime= true;
    }
}
System.out.println(isPrime);
//reverse inter
int number= 1234;
int rev=0;

while (number!=0) { //123
    int n= number%10;
    rev = rev*10+n; //40+3=4321
number = number/10;

}
    }
}
