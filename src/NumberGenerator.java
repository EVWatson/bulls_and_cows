import java.util.ArrayList;
import java.util.Collections;

public class NumberGenerator {

    private ArrayList<Integer> digits;


    public NumberGenerator(){
        this.digits = makeListOfDigits();
    }

    private ArrayList<Integer> makeListOfDigits() {
        this.digits = new ArrayList<>();
        for(int i = 0; i < 9; i++){
            this.digits.add(i+1);
        }
        Collections.shuffle(this.digits);
        return this.digits;
    }


    public ArrayList<Integer> generateFourDigitRandomNumber() {
        ArrayList<Integer> fourDigits = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            Integer number = this.digits.get(i);
            fourDigits.add(number);
        }
        return fourDigits;
    }
}
