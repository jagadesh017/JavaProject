package arraysConcepts.array;

public class Assending {
    public static void main(String[] args) {

        int arr[] =   {7,4,6,2,9,1,0,3};
        int temp;

        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i]>arr[j]) {
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
            }
        }

        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+","); //assendding order
        }
        System.out.println();
        for(int j=arr.length-1;j>=0;j--) {
            System.out.print(arr[j]+","); //desending order
        }
    }
}
