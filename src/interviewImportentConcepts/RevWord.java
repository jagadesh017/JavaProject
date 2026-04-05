package interviewImportentConcepts;

public class RevWord {
public static void main(String[] args) {
   
    String name = "hello this is jagade";
    String words[] = name.split(" ");

    StringBuilder sb = new StringBuilder();

    for(int i= words.length-1; i>=0; i--){
        sb.append(words[i]).append(" ");
    }
System.out.println(sb);
}
}