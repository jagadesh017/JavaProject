package interviewImportentConcepts;

public class RevProgram {

    public static void main(String[] args) {
        
    String name ="Jagadeesh";
    char ch;
    String reve="";

        for(int i=name.length()-1; i>=0; i--){
            ch= name.charAt(i);
            reve =ch+reve;
        }
        System.out.println(reve);
    }
}
