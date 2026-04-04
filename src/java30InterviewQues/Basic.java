package java30InterviewQues;

public class Basic {

public static void main(String[] args) {
//1. Reverse a String
String input ="Java";
String rev="";
for(int i=input.length()-1; i>=0;i--){

    rev= rev+ input.charAt(i);
}
System.out.println(rev);

//2. Palendrome or not

String pal= "madam";

String pal1= new StringBuilder(pal).reverse().toString();
if(pal.equals(pal1)){
    System.out.println("palendrome");
}else{
    System.out.println("not palendrome");
}

    }
}
