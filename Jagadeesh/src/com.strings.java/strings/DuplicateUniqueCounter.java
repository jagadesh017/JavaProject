package strings;
public class DuplicateUniqueCounter {
    public static void main(String[] args) {
        String input = "jagadeesh";
        char ch[] = input.toCharArray();
        
        int uniqueCount = 0;
        int duplicateCount = 0;

        for (int i = 0; i < ch.length; i++) {
            // Check if this character was already handled (to avoid double counting)
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
                duplicateCount++;
                System.out.println(ch[i] + " is a Duplicate");
            } else {
                uniqueCount++;
                System.out.println(ch[i] + " is Unique");
            }
        }

        System.out.println("\n--- Final Summary ---");
        System.out.println("Total Unique Characters: " + uniqueCount);
        System.out.println("Total Duplicate Characters (Sets): " + duplicateCount*2);
    }
}
