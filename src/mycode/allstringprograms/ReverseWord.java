package mycode.allstringprograms;

public class ReverseWord {
    public static void main(String[] args) {
        String name = "testing the new feature is easy way";
        String words[] = name.split(" ");
        StringBuilder sb = new StringBuilder();

        for(int i=words.length-1;i>=0;i--){
            sb.append(words[i]+ " ");
        }
        System.out.println(sb.toString());
    }

}
