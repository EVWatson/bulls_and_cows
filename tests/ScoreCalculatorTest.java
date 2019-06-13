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

        String expectedResult = "Well done you won!";

        String actualResult = scoreCalculator.calculateScore(playerGuess, computerNumbers);

        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void whenGuessedDigitsDoNotMatchAnyComputerDigitsPlayerLoses(){
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

        String expectedResult = "Bad luck, you lose";
        String actualResult = scoreCalculator.calculateScore(computerNumbers, playerGuess);

        assertEquals(expectedResult, actualResult);

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

        String expectedResult = "Bulls received: "+1+"\n"+"Cows received: "+0;
        String actualResult = scoreCalculator.calculateScore(computerNumbers, playerGuess);

        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void whenTheFirstTwoGuessedDigitsMatchesTheFirstTwoComputerDigitsPlayerGetsTwoBulls(){
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

        String expectedResult = "Bulls received: "+2+"\n"+"Cows received: "+0;
        String actualResult = scoreCalculator.calculateScore(computerNumbers, playerGuess);

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

        String expectedResult = "Bulls received: "+1+"\n"+"Cows received: "+0;
        String actualResult = scoreCalculator.calculateScore(computerNumbers, playerGuess);


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

        String expectedResult = "Bulls received: "+0+"\n"+"Cows received: "+1;
        String actualResult = scoreCalculator.calculateScore(computerNumbers, playerGuess);


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

        String expectedResult = "Bulls received: "+0+"\n"+"Cows received: "+2;
        String actualResult = scoreCalculator.calculateScore(computerNumbers, playerGuess);


        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void whenOneGuessedDigitsMatchOneComputerDigitInTheSamePositionAndOneInADifferentPositionPlayerGets1BullAnd1Cow(){
        ScoreCalculator scoreCalculator = new ScoreCalculator();

        ArrayList<Integer> computerNumbers = new ArrayList<>();
        computerNumbers.add(1);
        computerNumbers.add(2);
        computerNumbers.add(3);
        computerNumbers.add(4);

        ArrayList<Integer> playerGuess = new ArrayList<>();
        playerGuess.add(1);
        playerGuess.add(5);
        playerGuess.add(2);
        playerGuess.add(7);

        String expectedResult = "Bulls received: "+1+"\n"+"Cows received: "+1;
        String actualResult = scoreCalculator.calculateScore(computerNumbers, playerGuess);


        assertEquals(expectedResult, actualResult);

    }

}