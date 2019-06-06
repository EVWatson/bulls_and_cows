import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ScoreCalculator scoreCalculator = new ScoreCalculator();
        NumberGenerator numberGenerator = new NumberGenerator();

//        ArrayList<Double> computerNumbers = numberGenerator.getRandomNumber(1, 9);


// uses random class, generates single digit
//         int randomNumber = numberGenerator.generateRandomNumber(1, 9);
//        System.out.println(randomNumber);


// uses random class, generates single digit

//         int n = numberGenerator.generateNewRandomNumber(1, 9);
//        System.out.println(n);
//
//
//        System.out.println(numberGenerator.gettingCloser());

        ArrayList<Integer> digits = numberGenerator.getDigits();

        System.out.println(numberGenerator.generateRandomDigits(digits));



        ArrayList<Integer> playerGuess = new ArrayList<>();
        playerGuess.add(1);
        playerGuess.add(5);
        playerGuess.add(7);
        playerGuess.add(9);

//        scoreCalculator.hasPlayerWon(computerNumbers, playerGuess);

    }
}
