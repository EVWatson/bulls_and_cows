import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        NumberGenerator numberGenerator = new NumberGenerator();
        PlayerInput playerInput = new PlayerInput();
        ScoreCalculator scoreCalculator = new ScoreCalculator();
        ResultPrinter resultPrinter = new ResultPrinter();


        ArrayList<Integer> randomDigits = numberGenerator.generateFourDigitRandomNumber();
        ArrayList<Integer> d = new ArrayList<>();
        d.add(1);
        d.add(2);
        d.add(3);
        d.add(4);


        InstructionPrinter.printMessage(InstructionPrinter.START_GAME);
        InstructionPrinter.printMessage(InstructionPrinter.ENTER_GUESS);
//        ArrayList<Integer> playerGuess = playerInput.getPlayerGuess();
        ArrayList<Integer> pg = new ArrayList<>();
        pg.add(1);
        pg.add(2);
        pg.add(7);
        pg.add(8);


        System.out.println(scoreCalculator.calculateScore(d, pg));
//        resultPrinter.printResult(result, bulls, cows);
//        InstructionPrinter.printMessage();

    }
}
