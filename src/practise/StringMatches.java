package practise;

public class StringMatches {
    public static void main(String[] args) {
        //sum of digits
        String name ="hello111world345";
        int sum=0;

            for(char c: name.toCharArray()){
            if(Character.isDigit(c)){
                sum = sum+Character.getNumericValue(c);
            }
        }
        System.out.println(sum);
        
    }
}
