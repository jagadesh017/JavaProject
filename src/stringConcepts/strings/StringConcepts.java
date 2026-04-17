package stringConcepts.strings;
public class StringConcepts {

    public static void main(String[] args) {
        
        String auto = "Automation";

        StringBuilder sb = new StringBuilder(auto);
        StringBuffer sbuf= new StringBuffer(auto);
        sb.reverse();
        System.out.println(sb);
        sbuf.append("123Jagadeesh");
        System.out.println(sbuf);
        sbuf.replace(0, 1, "jag");
        System.out.println(sbuf);
      
        // print only 3 and 5 divisible numbers
        for(int i=1;i<=100;i++){
            if(i %3==0 && i%5==0){
                System.out.print(i + ",");
            }
        }
        // how to find out count occurrences of a character of the String auto ="Automation";
        // find the first non-repeated character in given string.
    String auto1 = "jagadeesh";
        char target = 'a';
        int count = 0;
        for (int i = 0; i < auto1.length(); i++) {
            if (auto1.charAt(i) == target) {
                count++;
            }
        }
        System.out.println("Occurrence of '" + target + "': " + count);
    }
    }