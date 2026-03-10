package javastringmethods;


public class A {

	public static void main(String[] args) {

		int value[] ={10,20,30,5,15,25};
		int temp;
		for(int i=0; i<value.length;i++) {
			
			for(int j=i+1;j<value.length;j++){
				
				if(value[i]>value[j]) {
					temp = value[i];
					value[i]= value[j];
					value[j]= temp;
				}
				
			}
		}
		
		
		for(int x=0; x<value.length;x++) {
			System.out.print(value[x] +", ");
		}
		System.out.println();
		for(int y=value.length-1; y>=0;y--) {
			System.out.print(value[y]+ ",");
		}
	}
}
