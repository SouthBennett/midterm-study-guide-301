import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

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
    
}


