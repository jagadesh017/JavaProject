package interviewImportentConcepts;

public class ReverseStringProgram {
    public static void main(String[] args) {
        String name ="testing";
        char ch;
        String rev="";
        for(int i=0; i<name.length();i++){
            ch=name.charAt(i);
            rev = ch+rev;
        }
        System.out.println(rev);
    }
    

}
