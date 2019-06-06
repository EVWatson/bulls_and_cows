import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class NumberGenerator {


    ArrayList<Integer> digits = new ArrayList<>();

    public ArrayList<Integer> getDigits() {
        for(int i = 0; i < 9; i++){
            digits.add(i+1);
        }
        Collections.shuffle(digits);
        return digits;
    }


    public ArrayList<Integer> generateRandomDigits(ArrayList<Integer> digits) {

        ArrayList<Integer> fourDigits = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            Integer number = digits.get(i);
            fourDigits.add(number);
        }

        return fourDigits;

    }

    public ArrayList<Integer> generateNumber() {
        ArrayList<Integer> fourDigitNumber = new ArrayList<>();
        fourDigitNumber.add(1);
        fourDigitNumber.add(2);
        fourDigitNumber.add(3);
        fourDigitNumber.add(4);


        return fourDigitNumber;
    }
}
