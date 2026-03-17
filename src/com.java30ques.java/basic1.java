package java30ques;

import java.util.HashMap;
import java.util.Map;

public class basic1 {
    public static void main(String[] args) {
        //3.  Duplicate Characters in String

String in1= "test";

Map<Character, Integer > dupli = new HashMap<>();

for(char c: in1.toCharArray()){
    dupli.put(c, dupli.getOrDefault(c,0)+1);
    
}
for(Map.Entry<Character, Integer> m:dupli.entrySet()){
    if(m.getValue()>1){
        System.out.println(m.getKey());
    }
//---------------------------------------
char ch[] = in1.toCharArray();

for(int i=0;i<ch.length;i++){
    boolean isDuplicate = false;
boolean isAlreadyDuplicate = false;
    for(int j=0; j<i;j++){
        if(ch[i]==ch[j]){
    isAlreadyDuplicate= true;
    break;
        }
    }
    for(int k=i+1; k<ch.length; k++){
        if(ch[i]==ch[k]){
            isDuplicate= true;
            break;
        }
        if(isAlreadyDuplicate) continue;    
    }
    
    if(isDuplicate){
        System.out.print("duplicates: "+ch[i] + ",");
    }else{
        System.out.print("non-duplicates: "+ ch[i] + ",");
    }
}
}
    }





}