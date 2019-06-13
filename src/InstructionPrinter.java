public class InstructionPrinter {

     final static String START_GAME = "~Welcome to Bulls and Cows~\n\nHere are the rules:\nThe computer will generate a random, 4 digit number. Each digit is between 1 and 9, and no two digits are the same.\nTry to guess the computer number by entering your own 4 digit number.\n\nScoring:\nFor every correct number in the correct position, you get one Bull.\nFor every correct number in the wrong position, you get a cow.\nIf you guess all four numbers in the correct order, you win.\nIf you guess no numbers correctly, you lose.\n\nGood luck!\n";

     final static String ENTER_GUESS = "Please enter your 4 digit number:\n";

     final static String WIN = "Well done you won!";

     final static String LOSE = "Bad luck you lose";




    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static void printScore(String score){
        System.out.println(score);
    }
}
