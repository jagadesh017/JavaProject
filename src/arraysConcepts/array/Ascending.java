package arraysConcepts.array;

public class Ascending {
    public static void main(String[] args) {

        int []arr = { 7, 4, 6, 2, 9, 1, 0, 3 };
        int temp;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }

        for (int k : arr) {
            System.out.print(k + ","); // ascending order
        }
        System.out.println();
        for (int j = arr.length - 1; j >= 0; j--) {
            System.out.print(arr[j] + ","); // descending order
        }
    }
}
