package arraysConcepts.array;

public class AssendingDisendingOrderOfArray {
	
	public static void main(String[] args) {
		
		int a[]= {7,4,6,2,9,1,0,3};
		int value;
		int length=a.length;
		for(int i=0;i<length;i++) {
			for(int j=i+1;j<length;j++){
				if(a[i]>a[j]) {
					value=a[i];
					a[i]=a[j];
					a[j]=value;
				}
			}
		}
		//assending order
		for(int b=0;b<length;b++) {
			System.out.print(a[b]+",");
		}
		System.out.println();
		
		for(int c=length-1;c>=0;c--) {
			System.out.print(a[c]+",");
		}
		
	}
	
		
}
