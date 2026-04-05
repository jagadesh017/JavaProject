package arraysConcepts.array;

import java.util.Arrays;

public class SecondLargestNum {

    public static void main(String[] args) {
        int[] a = {3, 6, 8, 4, 1, 9, 2, 7};

        Arrays.sort(a);
        int secondNum= a[a.length-2];
        System.out.println(secondNum);
        System.out.println(a[1]);


        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int num : a) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        System.out.println("Second Largest: " + secondLargest);
    }
}