package array;

import java.util.HashSet;
import java.util.Set;

public class Duplicates {
    static void main(String[] args) {
        //print only duplicates
        int a[]= {1,2,3,4,4,3,2};
        int temp=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                    System.out.println("duplicates are: "+temp);
                    break;

                }
            }
        }
       //remove duplicates and print
        int []b ={10,20,20,15,10};
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<b.length;i++){
           set.add(b[i]);
            }
        System.out.println(set.size());
        System.out.println(set);

    }
}
