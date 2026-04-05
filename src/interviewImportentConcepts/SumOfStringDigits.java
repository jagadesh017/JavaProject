package interviewImportentConcepts;

public class SumOfStringDigits {
    public static void main(String[] args) {
            
        String str = "hello123world456";

        String sp[] = str.split("[^0-9]");
        int sum=0;

        for(String s: sp){

            if(!s.isEmpty()){
                sum = sum+ Integer.parseInt(s);
            }
        }
        System.out.println(sum);


    }
}
