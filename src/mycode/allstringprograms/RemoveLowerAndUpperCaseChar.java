
package mycode.allstringprograms;

public class RemoveLowerAndUpperCaseChar {
    public static void main(String[] args) {
        String name ="Jagadeesh Gangireddygari";

        StringBuilder upper = new StringBuilder();
        StringBuilder lower = new StringBuilder();
        char ch[] = name.toCharArray();

        for(char c : ch){
            if(Character.isLowerCase(c)){
                lower.append(c);
            } else if (Character.isUpperCase(c)){
                upper.append(c);
            }
        }
        System.out.println(upper);
        System.out.println(lower);
    }
}
