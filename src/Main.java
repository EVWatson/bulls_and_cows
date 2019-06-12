import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        NumberGenerator numberGenerator = new NumberGenerator();
        PlayerInput playerInput = new PlayerInput();
        ScoreCalculator scoreCalculator = new ScoreCalculator();



        ArrayList<Integer> randomDigits = numberGenerator.generateFourDigitRandomNumber();
        ArrayList<Integer> cd = new ArrayList<>();
        cd.add(1);
        cd.add(3);
        cd.add(4);
        cd.add(7);



        ArrayList<Integer> playerGuess = playerInput.getPlayerGuess();

        ArrayList<Integer> guess = playerInput.playerGuess();

        System.out.println(scoreCalculator.calculateScore(randomDigits, playerGuess));


    }
}
