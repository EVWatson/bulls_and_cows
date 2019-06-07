import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        NumberGenerator numberGenerator = new NumberGenerator();
        PlayerImput playerImput = new PlayerImput();
        ScoreCalculator scoreCalculator = new ScoreCalculator();



//        ArrayList<Integer> randomDigits = numberGenerator.generateFourDigitRandomNumber();

        ArrayList<Integer> computerDigits = new ArrayList<>();
        computerDigits.add(1);
        computerDigits.add(5);
        computerDigits.add(6);
        computerDigits.add(3);

        ArrayList<Integer> playerGuess = playerImput.getPlayerGuess();


        System.out.println(scoreCalculator.calculateScore(playerGuess, computerDigits));


    }
}
