package stringConcepts.strings;

public class ReverseWordsChar {
    public static void main(String[] args) {
        // reverse two words in strings
        String name= "Java is fun";
        StringBuilder rev= new StringBuilder();
        String []words=name.split(" ");

        for( String word:words){
            StringBuilder sb= new StringBuilder(word);
            rev.append(sb.reverse().toString()).append(" ");
        }
        System.out.println(rev);
    }
}
