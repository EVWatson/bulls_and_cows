import java.util.ArrayList;

public class ScoreCalculator {

    public boolean hasPlayerWon(ArrayList<Integer> computerNumbers, ArrayList<Integer> playerGuess) {
        for(int digit = 0; digit < computerNumbers.size(); digit++){
            if(!computerNumbers.get(digit).equals(playerGuess.get(digit))){
                return false;
            }
        }
        return true;
    }
}
