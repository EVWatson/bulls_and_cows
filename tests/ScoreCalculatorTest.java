import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ScoreCalculatorTest {


    @Test
    public void whenGuessedNumbersMatchComputerGeneratedNumbersPlayerWins(){
        ScoreCalculator scoreCalculator = new ScoreCalculator();

        ArrayList<Integer> computerNumbers = new ArrayList<>();
        computerNumbers.add(1);
        computerNumbers.add(2);
        computerNumbers.add(3);
        computerNumbers.add(4);

        ArrayList<Integer> playerGuess = new ArrayList<>();
        playerGuess.add(1);
        playerGuess.add(2);
        playerGuess.add(3);
        playerGuess.add(4);

        assertTrue(scoreCalculator.hasPlayerWon(computerNumbers, playerGuess));

    }

    @Test
    public void whenGuessedNumberDoesNotMatchAnyComputerNumbersPlayerLoses(){
        ScoreCalculator scoreCalculator = new ScoreCalculator();

        ArrayList<Integer> computerNumbers = new ArrayList<>();
        computerNumbers.add(1);
        computerNumbers.add(2);
        computerNumbers.add(3);
        computerNumbers.add(4);

        ArrayList<Integer> playerGuess = new ArrayList<>();
        playerGuess.add(5);
        playerGuess.add(5);
        playerGuess.add(5);
        playerGuess.add(5);

        assertFalse(scoreCalculator.hasPlayerWon(computerNumbers, playerGuess));

    }

    @Test
    public void whenGuessedNumberMatchesTheFirstTwoComputerNumbersPlayerLoses(){
        ScoreCalculator scoreCalculator = new ScoreCalculator();

        ArrayList<Integer> computerNumbers = new ArrayList<>();
        computerNumbers.add(1);
        computerNumbers.add(2);
        computerNumbers.add(7);
        computerNumbers.add(9);

        ArrayList<Integer> playerGuess = new ArrayList<>();
        playerGuess.add(1);
        playerGuess.add(2);
        playerGuess.add(8);
        playerGuess.add(6);

        assertFalse(scoreCalculator.hasPlayerWon(computerNumbers, playerGuess));

    }

    @Test
    public void whenGuessedNumberMatchesTheLastComputerNumberPlayerLoses(){
        ScoreCalculator scoreCalculator = new ScoreCalculator();

        ArrayList<Integer> computerNumbers = new ArrayList<>();
        computerNumbers.add(1);
        computerNumbers.add(2);
        computerNumbers.add(7);
        computerNumbers.add(9);

        ArrayList<Integer> playerGuess = new ArrayList<>();
        playerGuess.add(2);
        playerGuess.add(3);
        playerGuess.add(8);
        playerGuess.add(9);

        assertFalse(scoreCalculator.hasPlayerWon(computerNumbers, playerGuess));

    }

    @Test
    public void whenTheFirstGuessedNumberMatchesTheFirstComputerNumberPlayerGetsABull(){
        ScoreCalculator scoreCalculator = new ScoreCalculator();

        ArrayList<Integer> computerNumbers = new ArrayList<>();
        computerNumbers.add(1);
        computerNumbers.add(2);
        computerNumbers.add(3);
        computerNumbers.add(4);

        ArrayList<Integer> playerGuess = new ArrayList<>();
        playerGuess.add(1);
        playerGuess.add(5);
        playerGuess.add(6);
        playerGuess.add(7);

        int expectedResult = 1;
        int actualResult = scoreCalculator.calculateBulls(computerNumbers, playerGuess);


        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void whenTheFirstTwoGuessedDigitsMatchesTheFirstTwoComputerDigitsPlayerGetsTwoBull(){
        ScoreCalculator scoreCalculator = new ScoreCalculator();

        ArrayList<Integer> computerNumbers = new ArrayList<>();
        computerNumbers.add(1);
        computerNumbers.add(2);
        computerNumbers.add(3);
        computerNumbers.add(4);

        ArrayList<Integer> playerGuess = new ArrayList<>();
        playerGuess.add(1);
        playerGuess.add(2);
        playerGuess.add(6);
        playerGuess.add(7);

        int expectedResult = 2;
        int actualResult = scoreCalculator.calculateBulls(computerNumbers, playerGuess);


        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void whenTheSecondGuessedDigitsMatchesTheSecondComputerDigitPlayerGetsABull(){
        ScoreCalculator scoreCalculator = new ScoreCalculator();

        ArrayList<Integer> computerNumbers = new ArrayList<>();
        computerNumbers.add(1);
        computerNumbers.add(2);
        computerNumbers.add(3);
        computerNumbers.add(4);

        ArrayList<Integer> playerGuess = new ArrayList<>();
        playerGuess.add(9);
        playerGuess.add(2);
        playerGuess.add(6);
        playerGuess.add(7);

        int expectedResult = 1;
        int actualResult = scoreCalculator.calculateBulls(computerNumbers, playerGuess);


        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void whenTheGuessedDigitMatchesAComputerDigitInADifferentPositionPlayerGetsACow(){
        ScoreCalculator scoreCalculator = new ScoreCalculator();

        ArrayList<Integer> computerNumbers = new ArrayList<>();
        computerNumbers.add(1);
        computerNumbers.add(2);
        computerNumbers.add(3);
        computerNumbers.add(4);

        ArrayList<Integer> playerGuess = new ArrayList<>();
        playerGuess.add(2);
        playerGuess.add(9);
        playerGuess.add(6);
        playerGuess.add(7);

        int expectedResult = 1;
        int actualResult = scoreCalculator.calculateCows(computerNumbers, playerGuess);


        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void whenTheGuessedDigitsMatchesTwoComputerDigitInDifferentPositionsPlayerGetsTwoCows(){
        ScoreCalculator scoreCalculator = new ScoreCalculator();

        ArrayList<Integer> computerNumbers = new ArrayList<>();
        computerNumbers.add(1);
        computerNumbers.add(2);
        computerNumbers.add(3);
        computerNumbers.add(4);

        ArrayList<Integer> playerGuess = new ArrayList<>();
        playerGuess.add(2);
        playerGuess.add(9);
        playerGuess.add(4);
        playerGuess.add(5);

        int expectedResult = 2;
        int actualResult = scoreCalculator.calculateCows(computerNumbers, playerGuess);


        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void whenTheGuessedDigitMatchesAComputerDigitInTheSamePositionPlayerGetsNoCows(){
        ScoreCalculator scoreCalculator = new ScoreCalculator();

        ArrayList<Integer> computerNumbers = new ArrayList<>();
        computerNumbers.add(1);
        computerNumbers.add(2);
        computerNumbers.add(3);
        computerNumbers.add(4);

        ArrayList<Integer> playerGuess = new ArrayList<>();
        playerGuess.add(5);
        playerGuess.add(2);
        playerGuess.add(6);
        playerGuess.add(7);

        int expectedResult = 0;
        int actualResult = scoreCalculator.calculateCows(computerNumbers, playerGuess);


        assertEquals(expectedResult, actualResult);

    }


}