package mycode.allstringprograms;

public class StringContainsOnlyChar {

    public static void main(String[] args) {
        String str = "1HelloWorlda";
        boolean isOnlyChar = true;
        char[] charArray = str.toCharArray();

        for(char c : charArray){
            if(Character.isDigit(c)){
                isOnlyChar = false;
            }
    }
        System.out.println(isOnlyChar);
        }
    }