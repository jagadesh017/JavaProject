package interviewImportentConcepts;

public class EachCharTwice {
public static void main(String[] args) {
    String name = "test";

    StringBuilder sb = new StringBuilder();
    for(int i=0; i<name.length();i++){
      char ch=  name.charAt(i);
        sb.append(ch).append(ch);
    }
System.out.println(sb);

}
}
