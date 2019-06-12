import java.util.ArrayList;
import java.util.Scanner;

public class PlayerInput {

   public ArrayList<Integer> playerGuess = new ArrayList<>();


    public ArrayList<Integer> getPlayerGuess() {
        Scanner playerInput = new Scanner(System.in);
        String[] newNumber = playerInput.next().split("");
        for(int index = 0; index <= newNumber.length-1; index++){
            int digit = Integer.parseInt(newNumber[index]);
            this.playerGuess.add(digit);
        }
        return this.playerGuess;
    }


    public ArrayList<Integer> playerGuess() {
        ArrayList<Integer> playerGuess = new ArrayList<>();
        playerGuess.add(1);
        playerGuess.add(2);
        playerGuess.add(3);
        playerGuess.add(9);

        return playerGuess;
    }
}
