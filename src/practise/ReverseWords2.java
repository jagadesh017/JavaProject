package practise;

public class ReverseWords2 {
    public static void main(String[] args) {
        
        String name = "jagadeesh gangireddygari";
        String splitVal[]= name.split(" ");
        StringBuilder sb = new StringBuilder();

        for( int i=splitVal.length-1; i>=0; i --){

            sb.append(splitVal[i]).append(" ");
        }
System.out.println(sb);
    }

}
