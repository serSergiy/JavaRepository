import java.util.Random;

import static java.lang.Math.abs;
import static java.lang.Math.random;

public class Model {

    private Controller gameHandler;

    private int valueToGuess;
    private int currentMax = 100;
    private int currentMin = 0;

    private int[] userAttemptsArray = new int [abs(currentMax-currentMin)]; //maxLen = |max-min|
    private int attemptsCount = 0;

    public void startGame(Controller inHandler){
        this.gameHandler = inHandler;
        valueToGuess = getRandValue(currentMin, currentMax);

        int userAttempt;
        do {
            userAttempt = gameHandler.getNewIntTry(currentMin, currentMax);
            userAttemptsArray[attemptsCount] = userAttempt;
            attemptsCount++;

            if (userAttempt < valueToGuess)
                currentMin = userAttempt;
            if (userAttempt > valueToGuess)
                currentMax = userAttempt;

        } while (userAttempt != valueToGuess);


    }

    /*
    public void setGameHandler (Controller inHandler){
        this.gameHandler=inHandler;
    }
    */
    private int getRandValue(int min, int max){
        return min + new Random().nextInt(min + max);
    }
}
