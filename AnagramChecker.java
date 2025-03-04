import java.util.Arrays;

public class AnagramChecker {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false; // If lengths are different, not an anagram
        }

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        // Sorting the arrays
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray, tArray); // Compare sorted arrays
    }

    public static void main(String[] args) {
        AnagramChecker checker = new AnagramChecker();
        
        // Test cases
        String word1 = "listen";
        String word2 = "silent";
        
        System.out.println("Are '" + word1 + "' and '" + word2 + "' anagrams? " + checker.isAnagram(word1, word2));
        
        String word3 = "hello";
        String word4 = "world";
        
        System.out.println("Are '" + word3 + "' and '" + word4 + "' anagrams? " + checker.isAnagram(word3, word4));
    }
}
