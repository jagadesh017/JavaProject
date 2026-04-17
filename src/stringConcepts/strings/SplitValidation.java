package stringConcepts.strings;

import oopsConcepts.hiraricalinheritance.C;

public class SplitValidation {
    public static void main(String[] args) {

        // print only numbers in the string
        String j = "124hello456world";
        String[] j1 = j.split("[^0-9]");
        int sum = 0;
        for (String a : j1) {
            if (!a.isEmpty()) {
                sum = sum + Integer.parseInt(a);
            }
        }
        System.out.println(sum);
        String k = "124hello456world";
        char []ch= k.toCharArray();
        int sum1=0;
        for(char c: ch){
            if(Character.isDigit(c)){
                sum1= sum1+ Character.getNumericValue(c);
            }
        }
        System.out.println(sum1);
    }
}
