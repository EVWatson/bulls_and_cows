import java.util.ArrayList;
import java.util.Scanner;

public class PlayerInput {

//    validation next - what to do when < or > digits received, or letters?

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

}
