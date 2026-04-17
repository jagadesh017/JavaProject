package arraysConcepts.array;

public class AscendingDescendingOrderOfArray {
	
	public static void main(String[] args) {
		
		int []a= {7,4,6,2,9,1,0,3};
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		//ascending order
		for(int b=0;b<a.length;b++) {
			System.out.print(a[b]+",");
		}
		System.out.println();
		//descending order
		for(int c=a.length-1;c>=0;c--) {
			System.out.print(a[c]+",");
		}
		
	}
	
		
}
