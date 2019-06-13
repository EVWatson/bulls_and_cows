public class ResultPrinter {

    public void printResult(Boolean win, int bulls, int cows){
        if(win){
            System.out.println("Well done you won!");
        }
        if(!win){
            System.out.println("Bad luck, you lose");
        }else {
            System.out.println("Number of Bulls = " + bulls);
            System.out.println("Number of Cows = " + cows);
        }
    }
}
