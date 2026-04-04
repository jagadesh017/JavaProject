package practise;

public class SumOfStringDigits {
    public static void main(String[] args) {
        String name ="hellow123world456";
        int sum=0;
        String d= name.trim().replaceAll("[^0-9]", " ");
        System.out.println(d);
        
        String splitval[]= d.split(" ");

        for(String v: splitval){

            if(!v.isEmpty()){
              sum=  sum +Integer.parseInt(v);
            }
        }
   System.out.println(sum);

    }
}