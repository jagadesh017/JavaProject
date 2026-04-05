package interviewImportentConcepts;

public class ValidateMobileNumber {

    public static void main(String[] args) {
        String input = "+91-8123456789";
        String digitsOnly = input.replaceAll("[^0-9]", "");

        if (digitsOnly.length() > 10) {

           String mobileNum= digitsOnly.substring(digitsOnly.length()-10);
           if(mobileNum.length()==10){
            System.out.println(mobileNum + " is captures sucessfully");
           }
           
        }else{
            System.out.println("number is too short");
        }
    }
}
