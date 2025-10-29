import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

public class Practice {
    /**
     * Returns the difference between the largest and smallest integer in an array.
     * 
     * @param nums a non-empty, non-null array of numbers
     * @return the difference between the largest and smallest number
     */
    public static int maxDiff(int[] nums) {
        // TODO: implement this
        int smallest = nums[0];
        int largest = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < smallest) {
                smallest = nums[i];
            } 
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }
        int maxDifference = largest - smallest;
        return maxDifference;
    }


    // TODO: Implement the other methods from the study guide AND tests for each one

    // For each method you are only required to implement it for one of the data
    // structures. But use a different data structure for each method. For example,
    // do maxDiff with an array, the next question with a Set, etc.

    /**
     * Returns the longest word that starts with a specific character letter in an ArrayList
     */
     public static String longestWord(ArrayList<String> words, char targetLetter) {
        
        String longestWord = "";
        
        for (int i = 0; i < words.size(); i++) {
            
            char c = words.get(i).toLowerCase().charAt(0);

            char lowercaseTarget = Character.toLowerCase(targetLetter);

            if (c == lowercaseTarget) {
                String currentWord = words.get(i);
                if (currentWord.length() > longestWord.length()) {
                    longestWord = currentWord;
                }
            }

        }
        return longestWord;
    }

    /**
     * Counts how many words are longer than n characters and Shorter than m characters in a HashSet
     */
    public static int longerThanShorterThan(HashSet<String> words, int n, int m) {
        
        int count = 0;

        for (String word : words) {
            if (word.length() > n && word.length() < m) {
                count++;
            }
        }
        return count;
    }

    /**
     * Return the difference between how many odd and even numbers there are in the values of a HashMap
     */
    public static int diffOddAndEven(HashMap<Integer, Integer> map) {
        int odd = 0;

        int even = 0;
        
        for (int value : map.values()) {
            if (value / 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        return Math.abs(even - odd);
    }

}