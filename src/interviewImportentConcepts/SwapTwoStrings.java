package interviewImportentConcepts;

public class SwapTwoStrings {
public static void main(String[] args) {
    
    String baby1 = "Hrudhitha";
    String baby2 ="Nihitha";


    baby1 = baby1 +baby2; // HrudhithaNihitha

    baby2= baby1.substring(0, baby1.length()-baby2.length()); // 0, 16-7=9 so (0,9)
   baby1 = baby1.substring(baby2.length()); // 16-7 = 9 so it will start form 9
    System.out.println(baby1);
    System.out.println(baby2);

  
}
}
