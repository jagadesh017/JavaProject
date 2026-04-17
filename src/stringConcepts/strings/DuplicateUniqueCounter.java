package stringConcepts.strings;
public class DuplicateUniqueCounter {
    public static void main(String[] args) {
        String input = "jagadeesh";
        char []ch = input.toCharArray();
        
        int uniqueCharCount = 0;
        int duplicateCharCount = 0;

        for (int i = 0; i < ch.length; i++) {
            boolean alreadySeen = false;
            for (int k = 0; k < i; k++) {
                if (ch[i] == ch[k]) {
                    alreadySeen = true;
                    break;
                }
            }
            if (alreadySeen) continue;

            // Check if this character repeats anywhere else in the string
            boolean isRepeated = false;
            for (int j = 0; j < ch.length; j++) {
                if (i != j && ch[i] == ch[j]) {
                    isRepeated = true;
                    break;
                }
            }

            if (isRepeated) {
                duplicateCharCount++;
                System.out.println(ch[i] + " is a Duplicate");
            } else {
                uniqueCharCount++;
                System.out.println(ch[i] + " is Unique");
            }
        }

        System.out.println("\n--- Final Summary ---");
        System.out.println("Total Unique Characters: " + uniqueCharCount);
        System.out.println("Total Duplicate Characters (Sets): " + duplicateCharCount*2);
    }
}
