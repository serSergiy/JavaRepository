public class View {

    //Base methods
    public void printMessage(String message){
        System.out.println(message);
    }

    public void printMessageAndInt(String message, int value){
        System.out.println(message + value);
    }

    //Specified situations
    public void startInput(){
        printMessage(StringRes.INPUT_INT);
    }

    public void wrongInputAlert(){
        printMessage( StringRes.WRONG_INPUT_INT_DATA);
    }

    public void boundsAlert(int minBound, int maxBound){
        printMessage(StringRes.ENDL + StringRes.INPUT_RECOMENDATION_MORE + minBound);
        printMessage(StringRes.INPUT_RECOMENDATION_LESS + maxBound);

    }

    public void startGreeting(){
        printMessage(StringRes.START_MESSAGE);
    }


}
