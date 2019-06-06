import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ScoreCalculator scoreCalculator = new ScoreCalculator();
        NumberGenerator numberGenerator = new NumberGenerator();


        System.out.println(numberGenerator.generateFourDigitRandomNumber());



        ArrayList<Integer> playerGuess = new ArrayList<>();
        playerGuess.add(1);
        playerGuess.add(5);
        playerGuess.add(7);
        playerGuess.add(9);

//        scoreCalculator.hasPlayerWon(computerNumbers, playerGuess);

    }
}
