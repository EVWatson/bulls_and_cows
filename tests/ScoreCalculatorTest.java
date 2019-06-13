import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.*;

public class ScoreCalculatorTest {

    private ScoreCalculator scoreCalculator;
    private ResultPrinter resultPrinter;

    @Before
    public void setUp(){
        this.scoreCalculator = new ScoreCalculator();
        this.resultPrinter = new ResultPrinter();
    }


    @Test
    public void whenGuessedNumbersMatchComputerGeneratedNumbersPlayerWins(){

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

        HashMap<String, Integer> score = scoreCalculator.calculateScore(computerNumbers, playerGuess);
        GameState gameState = scoreCalculator.determineWinOrLoss(score);
        String actualResult = resultPrinter.determineResult(gameState, score.get("bulls"), score.get("cows"));

       assertEquals(expectedResult, actualResult);

    }

    @Test
    public void whenGuessedDigitsDoNotMatchAnyComputerDigitsPlayerLoses(){
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
        HashMap<String, Integer> score = scoreCalculator.calculateScore(computerNumbers, playerGuess);
        GameState gameState = scoreCalculator.determineWinOrLoss(score);
        String actualResult = resultPrinter.determineResult(gameState, score.get("bulls"), score.get("cows"));

        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void whenTheFirstGuessedNumberMatchesTheFirstComputerNumberPlayerGetsABull(){
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

        String expectedResult = "Number of Bulls = 1\n"+"Number of Cows = 0";

        HashMap<String, Integer> score = scoreCalculator.calculateScore(computerNumbers, playerGuess);
        GameState gameState = scoreCalculator.determineWinOrLoss(score);
        String actualResult = resultPrinter.determineResult(gameState, score.get("bulls"), score.get("cows"));

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void whenTheFirstTwoGuessedDigitsMatchesTheFirstTwoComputerDigitsPlayerGetsTwoBulls(){
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

        String expectedResult = "Number of Bulls = 2\n"+"Number of Cows = 0";
        HashMap<String, Integer> score = scoreCalculator.calculateScore(computerNumbers, playerGuess);
        GameState gameState = scoreCalculator.determineWinOrLoss(score);
        String actualResult = resultPrinter.determineResult(gameState, score.get("bulls"), score.get("cows"));

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

        String expectedResult = "Number of Bulls = 1\n"+"Number of Cows = 0";
        HashMap<String, Integer> score = scoreCalculator.calculateScore(computerNumbers, playerGuess);
        GameState gameState = scoreCalculator.determineWinOrLoss(score);
        String actualResult = resultPrinter.determineResult(gameState, score.get("bulls"), score.get("cows"));

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

        String expectedResult = "Number of Bulls = 0\n"+"Number of Cows = 1";
        HashMap<String, Integer> score = scoreCalculator.calculateScore(computerNumbers, playerGuess);
        GameState gameState = scoreCalculator.determineWinOrLoss(score);
        String actualResult = resultPrinter.determineResult(gameState, score.get("bulls"), score.get("cows"));

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

        String expectedResult = "Number of Bulls = 0\n"+"Number of Cows = 2";;

        HashMap<String, Integer> score = scoreCalculator.calculateScore(computerNumbers, playerGuess);
        GameState gameState = scoreCalculator.determineWinOrLoss(score);
        String actualResult = resultPrinter.determineResult(gameState, score.get("bulls"), score.get("cows"));

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

        String expectedResult = "Number of Bulls = 1\n"+"Number of Cows = 1";;

        HashMap<String, Integer> score = scoreCalculator.calculateScore(computerNumbers, playerGuess);
        GameState gameState = scoreCalculator.determineWinOrLoss(score);
        String actualResult = resultPrinter.determineResult(gameState, score.get("bulls"), score.get("cows"));

        assertEquals(expectedResult, actualResult);

    }

}