package interviewImportentConcepts;

public class RemoveSpaces {
    public static void main(String[] args) {
        String name ="hello world this is java";
      
        StringBuilder sb= new StringBuilder();

        for(int i=0; i<name.length();i++){
            if(name.charAt(i)!= ' '){
                sb.append(name.charAt(i));
            }
        }
        System.out.println(sb);
    }

}
