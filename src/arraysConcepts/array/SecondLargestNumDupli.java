package arraysConcepts.array;

import java.util.Arrays;

public class SecondLargestNumDupli {

    public static void main(String[] args) {
        int []a = {3, 6, 8, 4, 1, 9, 2, 7};
        Arrays.sort(a);
        System.out.println(a[a.length - 2]);

        int max = a[0];
        int secondMax = a[1];

        for (int n : a) {
            if (n > max) {
                secondMax = max;
                max = n;
            } else if (n > secondMax) {
                secondMax = n;
            }
        }
        System.out.println("Second Largest: " + secondMax);
        //--------------

        int []num= {10,20,30,5,15,25};
        int maxi   = num[0];
        int secondMaxi = num[1];
        for (int n : num) {
            if (n > maxi) {
                secondMaxi = maxi;
                maxi = n;
            } else if (n > secondMaxi) {
                secondMaxi = n;
            }
        }
        System.out.println("Second Largest: " + secondMaxi);

    }
}