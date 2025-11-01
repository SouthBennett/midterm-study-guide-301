import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;


public class PracticeTest {

    // TODO: Make more tests for maxDiff
    @Test
    void testMaxDiffPositiveAndNegative() {
        // Arrange
        int[] numbers = {8, -2, 9, -5};

        // Act
        int actual = Practice.maxDiff(numbers);

        // Assert
        // Largest: 9, Smallest: -5, Difference: 9 - -5 = 14
        assertEquals(14, actual);
    }

    @Test
    void testMaxDiffSingleElement() {
        //Arrange
        int[] numbers = {9};

        //Act 
        int actual = Practice.maxDiff(numbers);

        //Assert
        assertEquals(0, actual);
    
    }  
    
    @Test 
    void testMaxDiffLargeRangeOfNumbers() {
        //Arrange
        int[] numbers = {-5000, 2000, 300, -1500, 50};

        //Act 
        int actual = Practice.maxDiff(numbers);

        //Assert
        assertEquals(7000, actual);
    }
    
    // TODO: Make tests for each problem you solve
    @Test
    void testLongestWord() {
        //Arrange
        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("astronaut");
        words.add("bed");
        words.add("bicycle");
        words.add("cat");
        words.add("cartoon");

        //Act
        String actual = Practice.longestWord(words, 'c');

        //Assert 
        assertEquals("cartoon", actual);
    }

    @Test
    void testLongestWordCaseSensitive() {
        //Arrange
        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("astronaut");
        words.add("bed");
        words.add("bicycle");
        words.add("cat");
        words.add("cartoon");

        //Act
        String actual = Practice.longestWord(words, 'A');

        //Assert 
        assertEquals("astronaut", actual);
    }

    @Test 
    void testLongestWordNoMatchFound() {
        //Arrange
        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("astronaut");
        words.add("bed");
        words.add("bicycle");
        words.add("cat");
        words.add("cartoon");

        //Act
        String actual = Practice.longestWord(words, 'D');

        //Assert 
        assertEquals("", actual);
    }

    @Test
    void testLongerThanShorterThanValidWords() {
        // Arrange
        HashSet<String> words = new HashSet<>();
        words.add("Do");
        words.add("lie");
        words.add("kill");
        words.add("treat");
        words.add("cookie");
        words.add("whoopin");

        // Act
        int actual = Practice.longerThanShorterThan(words, 2, 7);
        
        // Assert Equals
        assertEquals(4, actual);
    }

    @Test
    void testLongerThanShorterInvalidWords() {
        //Arrange
        HashSet<String> words = new HashSet<>();
        words.add("Do");
        words.add("lie");
        words.add("kill");
        words.add("treat");
        words.add("cookie");
        words.add("whoopin");

        //Act
        int actual = Practice.longerThanShorterThan(words, 7, 15);

        assertEquals(0, actual);
    }

    @Test
    void testLongerThanShorterInvalidWordsEmptySet() {
        //Arrange
        HashSet<String> words = new HashSet<>();

        //Assert
        int actual = Practice.longerThanShorterThan(words, 3, 7);

        assertEquals(0, actual);
    }

    @Test
    void testDiffOddandEven() {
        // Arrange 
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        map.put("e", 5);
        map.put("f", 6);

        //Act
        int acutal = Practice.diffOddAndEven(map);

        //Assert
        assertEquals(0, acutal);
    }

    @Test 
    void testDiffOddAndEvenNegativeNumbers() {
        // Arrange 
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", -1);
        map.put("b", -2);
        map.put("c", -3);
        map.put("d", -4);
        map.put("e", -5);
        map.put("f", -6);

        // Act
        int actual = Practice.diffOddAndEven(map);

        // Assert
        assertEquals(0, actual);
    }

    @Test
    void testDiffOddAndEvenOneValue() {
        // Arrange
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 1);

        //Act 
        int actual = Practice.diffOddAndEven(map);

        //Assert
        assertEquals(1, actual);
    }


}


