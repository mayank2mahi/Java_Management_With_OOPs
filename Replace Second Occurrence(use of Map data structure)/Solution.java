
---

## 💻 Code

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String result = replaceSecondOccurrenceCaseSensitive(input);
        System.out.println(result);
    }

    public static String replaceSecondOccurrenceCaseSensitive(String str) {
        Map<Character, Integer> freq = new HashMap<>();
        StringBuilder sb = new StringBuilder(str);
        boolean duplicateFound = false;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Only process letters (ignore spaces, punctuation, numbers)
            if (Character.isLetter(ch)) {
                int count = freq.getOrDefault(ch, 0) + 1; // If ch exists in the map, give me its value; otherwise, give me the default value 0.
                freq.put(ch, count);

                // Replace only the 2nd occurrence of that exact-case character
                if (count == 2) {
                    sb.setCharAt(i, '?');
                    duplicateFound = true;
                }
            }
        }

        if (!duplicateFound) {
            return "No duplicates present in the given string";
        }

        return sb.toString();
    }
}
