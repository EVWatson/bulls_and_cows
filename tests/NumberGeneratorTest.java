import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class NumberGeneratorTest {

    @Test
    public void generateNumberReturnsNewArrayListWithFourDigits(){
        NumberGenerator numberGenerator = new NumberGenerator();

        int expectedResult = 4;

        int actualResult = numberGenerator.generateNumber().size();

        assertEquals(expectedResult, actualResult);
    }

//    TODO: add this test in later:

    @Test
    public void generateNumberReturnsNewArrayListWithNoDigitDuplication(){
        NumberGenerator numberGenerator = new NumberGenerator();

        assert

    }

}