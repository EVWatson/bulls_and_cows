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

        int i = randomDigits.size();
        assertFalse(randomDigits.contains(i) && randomDigits.contains(i) && randomDigits.contains(i) && randomDigits.contains(i));

    }

}