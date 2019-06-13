import org.junit.Test;

import java.util.ArrayList;


import static org.junit.Assert.*;

public class NumberGeneratorTest {

    @Test
    public void generateFourDigitRandomNumberReturnsNewArrayListWithFourDigits(){
        NumberGenerator numberGenerator = new NumberGenerator();

        int expectedResult = 4;

        int actualResult = numberGenerator.generateFourDigitRandomNumber().size();

        assertEquals(expectedResult, actualResult);
    }


//    not sure how to improve this test to say it returns four digits between 1 and 9 only
    @Test
    public void generateFourDigitRandomNumberReturnsNewArrayListWithFourDigitsBetweenAnd1And9(){
        NumberGenerator numberGenerator = new NumberGenerator();

        ArrayList<Integer> randomDigits = numberGenerator.generateFourDigitRandomNumber();


        assertTrue(randomDigits.contains(1)|| randomDigits.contains(2) || randomDigits.contains(3) || randomDigits.contains(4) ||
                randomDigits.contains(5) || randomDigits.contains(6) || randomDigits.contains(7) || randomDigits.contains(8) || randomDigits.contains(9)
        );
    }



    @Test
    public void generateFourDigitRandomNumberReturnsNewArrayListWithNoDigitDuplication(){
        NumberGenerator numberGenerator = new NumberGenerator();

        ArrayList<Integer> randomDigits = numberGenerator.generateFourDigitRandomNumber();

        assertFalse(
                randomDigits.get(0).equals(randomDigits.get(1)) && randomDigits.get(0).equals(randomDigits.get(2)) && randomDigits.get(0).equals(randomDigits.get(3)) &&
                randomDigits.get(1).equals(randomDigits.get(2)) && randomDigits.get(1).equals(randomDigits.get(3))&& randomDigits.get(2).equals(randomDigits.get(3))
        );
    }

}