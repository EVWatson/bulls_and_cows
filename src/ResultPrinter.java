public class ResultPrinter {

    public String determineResult(GameState state, Integer bulls, Integer cows){
        String result;
        switch (state){
            case WIN:
                result = "Well done you won!";
                break;
            case LOSE:
                result = "Bad luck, you lose";
                break;
            default:
                result = "Number of Bulls = " + bulls + "\nNumber of Cows = " + cows;
                break;
        }
        return result;
    }

    public void printResult(String result){
        System.out.println(result);
    }
}
