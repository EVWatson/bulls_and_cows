import java.util.ArrayList;

public class ScoreCalculator {

    private int bulls;
    private int cows;


    public ScoreCalculator(){
        this.bulls = 0;
        this.cows = 0;
    }

    public String calculateScore(ArrayList<Integer> computerNumbers, ArrayList<Integer> playerGuess){

            String finalScore = determineBullsAndCows(computerNumbers, playerGuess);

            if(this.bulls == 4){
                finalScore = "Well done you won!";
            }
            if(this.bulls == 0 && this.cows == 0){
                finalScore = "Bad luck you lose";
            }
        return finalScore;
    }

    private String determineBullsAndCows(ArrayList<Integer> computerNumbers, ArrayList<Integer> playerGuess){
        for(int digit = 0; digit < playerGuess.size(); digit++) {
            if (playerGuess.get(digit).equals(computerNumbers.get(digit))) {
                this.bulls++;
            }else if (computerNumbers.contains(playerGuess.get(digit)) &&
                    !computerNumbers.get(digit).equals(playerGuess.get(digit))) {
                this.cows++;
            }
        }
        return "Bulls received: " + this.bulls +"\n"+"Cows received: " + this.cows;
    }

}
