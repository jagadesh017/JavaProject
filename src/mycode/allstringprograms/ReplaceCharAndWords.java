package mycode.allstringprograms;

public class ReplaceCharAndWords {
    public static void main(String[] args) {
        String str = "Hello World";
        String str1 = "Hello123World";

        String newstr=str.replaceAll("Hello", "World");
        String newstr1=str1.replaceAll("123", "World");
        String newstr2=newstr.replaceAll(" ", "");
        System.out.println(newstr);
        System.out.println(newstr1);
        System.out.println(newstr2);
    }

}
