import java.lang.reflect.Array;
import java.util.*;

public class ScoreCalculator {

    private int bulls;
    private int cows;



    public ScoreCalculator(){
        this.bulls = 0;
        this.cows = 0;
    }



    public HashMap<String, Integer> calculateScore(ArrayList<Integer> computerNumbers, ArrayList<Integer> playerGuess){
        return determineBullsAndCows(computerNumbers, playerGuess);
    }


    private HashMap<String, Integer> determineBullsAndCows(ArrayList<Integer> computerNumbers, ArrayList<Integer> playerGuess){
        for(int digit = 0; digit < playerGuess.size(); digit++) {
            if (playerGuess.get(digit).equals(computerNumbers.get(digit))) {
                this.bulls++;
            }
            if (computerNumbers.contains(playerGuess.get(digit)) &&
                    !computerNumbers.get(digit).equals(playerGuess.get(digit))) {
                this.cows++;
            }
        }
        HashMap<String, Integer> score = new HashMap<>();
        score.put("bulls", this.bulls);
        score.put("cows", this.cows);
        return score;
    }


    public GameState determineWinOrLoss(HashMap<String, Integer> scores) {
        if(scores.get("bulls") == 4){
            return GameState.WIN;
        }
        if(scores.get("bulls") == 0 && scores.get("cows") == 0){
            return GameState.LOSE;
        }
        return GameState.DRAW;
    }
}
