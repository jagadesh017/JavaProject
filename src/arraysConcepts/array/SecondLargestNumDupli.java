package arraysConcepts.array;

import java.util.Arrays;

public class SecondLargestNumDupli {

    public static void main(String[] args) {
        int[] a = {3, 6, 8, 4, 1, 9, 2, 7};
        Arrays.sort(a);
        System.out.println(a[a.length - 2]);

        int max = a[0];
        int secondMax = a[1];
        for (int j : a) {
            if (j > max) {
                secondMax = max;
                max = j;
            } else if (j > secondMax && j != max) {
                secondMax = j;
            }
        }
        System.out.println("Second Largest: " + secondMax);
    }
}