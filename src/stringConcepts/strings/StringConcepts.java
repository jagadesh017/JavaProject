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
            if(i %3==0 || i%5==0){
                System.out.print(i + ",");
            }
        }
        // how to find out count occurrences of a character of the String auto ="Automation";
        // find the first non-repeated character in given string.
    String auto1 = "jagadeesh";
        char target = 'a';
        int count = 0;

        // Convert to lowercase to make it case-insensitive
        String lowerAuto = auto1.toLowerCase();

        for (int i = 0; i < lowerAuto.length(); i++) {
            if (lowerAuto.charAt(i) == target) {
                count++;
            }
        }
        System.out.println("Occurrence of '" + target + "': " + count);
System.out.println("----------------------------------------------------------");
 String input = "jagadeesh";
 char ch[]= input.toCharArray();

 for(int i=0; i<=input.length(); i++){

    for( int j=i+1;j<input.length();j++){

        if(ch[i]==ch[j]){
            System.out.println(ch[i]);
        break;    
        } else if( ch[i]!=ch[j]){
            System.out.print(ch[i]+",");
            break;
        } 
    }
    
 }
        
        

    }
    }


