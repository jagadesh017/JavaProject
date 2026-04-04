package mycode.allstringprograms;

public class CountWordsInSentance {

    public static void main(String[] args) {
        String s = "hello world java is one of the language";
        String words[] = s.split(" ");
        int count=0;
        for(String word : words){
            count++;
        }
        System.out.println(count);

    }

}
