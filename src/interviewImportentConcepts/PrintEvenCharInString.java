package interviewImportentConcepts;

public class PrintEvenCharInString {
    public static void main(String[] args) {
        String name ="jagad";

        for(int i=0; i<name.length();i++){

            if(i%2==1){ // 
               
                System.out.println(name.charAt(i));
            }

        }
    }

}
