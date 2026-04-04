package mycode.allstringprograms;

public class ReverseThirdWord {

    public static void main(String[] args) {
        String string =  "let's call the main method";
        String splitString[] = string.split(" ");

        String rev= splitString[2];
        String revs="";
        for(int i=rev.length()-1;i>=0;i--){
            revs= revs+ rev.charAt(i);

        }
        System.out.print(revs);



    }

}
