package stringConcepts.strings;

public class ReverseWordsChar {
    public static void main(String[] args) {
        // reverse two words in strings
        String name= "Java is fun";
        StringBuilder rev= new StringBuilder();
        String []words=name.split(" ");

        for( String word:words){
            StringBuilder sb= new StringBuilder(word);
            rev.append(sb.reverse()).append(" ");
        }
        System.out.println(rev);

        String s = "hello world of java";
        String []splits = s.split(" ");
        String revesedString = "";
        for(String word:splits){
            char []ch = word.toCharArray();
            String revs = "";
            for(int i=ch.length-1;i>=0;i--){
                revs = revs + ch[i];
        }
        revesedString = revs + " " + revesedString;
}
        System.out.println(revesedString);
    }
}
