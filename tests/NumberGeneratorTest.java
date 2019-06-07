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