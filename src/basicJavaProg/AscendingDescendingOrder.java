package basicJavaProg;

public class AscendingDescendingOrder {
	public static void main(String[] args) {
		// array programs--array length,sum,ascending,descending,small and big
		// number,matrix

		int []a = { 10, 30, 20, 40, 80, 100, 5 };
		int temp=0;
		for (int i = 0; i < a.length; i++) {
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}	
			}				
		}
		//ascending order
		for(int x=0;x<a.length;x++) {
			System.out.print(a[x]+",");
			
		}
		//descending order
		System.out.println("");
		for(int z=a.length-1;z>=0;z--) {
			System.out.print(a[z]+",");
		}
	}
}