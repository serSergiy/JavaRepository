import java.util.Scanner;

public class Controller
{
    private Model model;
    private View view;
    private Scanner sc;


    public Controller(Model modelIn, View viewIn) {
        this.model  = modelIn;
        this.view = viewIn;
    }

    // The Work method
    public void processUser(){
        this.sc = new Scanner(System.in);

        view.startGreeting();
        model.startGame(this);

    }


    // Input methods
    public int inputIntValueWithScanner(Scanner sc) {
        view.startInput();

        while( ! sc.hasNextInt()) {
            view.wrongInputAlert();
            view.startInput();
            sc.next();
        }
        return sc.nextInt();
    }

    public int getNewIntTry(int minValue, int maxValue) {
        view.boundsAlert(minValue, maxValue);
        int inputValue = inputIntValueWithScanner(this.sc);

        while ( (inputValue < minValue) || (inputValue > maxValue) ){
            view.boundsAlert(minValue, maxValue);
            inputValue = inputIntValueWithScanner(this.sc);
        }
        return inputValue;
    }

}
