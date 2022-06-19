

public class SplitInputNumber {

    public String[] split(String inputText) {
        String minus    = "-";
        String plus     = "\\+";
        String divide   = "/";
        String multiply = "\\*";

        switch (OperationType.get(inputText)){
            case MINUS:
                String[] splitMINUS = inputText.split(minus);
                return splitMINUS;
            case PLUS:
                String[] splitPLUS = inputText.split(plus);
                return splitPLUS;
            case DIVIDE:
                String[] splitDIVIDE = inputText.split(divide);
                return splitDIVIDE;
            case MULTIPLY:
                String[] splitMULTIPLY = inputText.split(multiply);
                return splitMULTIPLY;
            case NONE:
                String[] resultNONE = new String[] {"0", "0"};
                return resultNONE;
            default:
                String[] result = new String[] {"0", "0"};
                return result;
        }
    }
}
