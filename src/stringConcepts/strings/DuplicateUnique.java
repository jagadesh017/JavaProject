package stringConcepts.strings;

public class DuplicateUnique {
    public static void main(String[] args) {
           
    String auto= "keeerthi";
    char c[]= auto.toLowerCase().toCharArray();
    int duplicates=0;
    int uqiqueCh=0;

    for(int i=0; i<c.length;i++){
    boolean isDuplicate= false;
        boolean isAlreadyDuplicate= false;
        for(int j=0; j<i;j++){
            if(c[i]==c[j]){
                isAlreadyDuplicate= true;
                break;
            }
        }
            for(int k=i+1; k<c.length;k++){
                if(c[i]==c[k]){
                isDuplicate= true;
                break;
            }
            }
            if(isAlreadyDuplicate) continue;
            if(isDuplicate){
            duplicates++;
            System.out.println(c[i]+" :is duplicate");
        } else {
            uqiqueCh++;
            System.out.println(c[i]+": is not duplicate");
        }
        }
        System.out.println("duplicates count:"+ duplicates);
        System.out.println("non duplicates :" + uqiqueCh);
     
    }
}