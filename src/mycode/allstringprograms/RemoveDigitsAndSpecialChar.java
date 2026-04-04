package mycode.allstringprograms;

public class RemoveDigitsAndSpecialChar {

    public static void main(String[] args) {
        String string=" heallo!@%^&657";

        String newone= string.replaceAll("[0-9!@#$%^&*()]", "");
        System.out.println(newone);
    }
}
