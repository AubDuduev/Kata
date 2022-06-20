import java.io.FileNotFoundException;
import java.util.Scanner;

import java.util.Scanner;

public class Main {
    //считывает данные с консоли
    static Scanner scanner                   = new Scanner(System.in);
    static Calculation calculation           = new Calculation();
    static SplitInputNumber splitInputNumber = new SplitInputNumber();
    static Converter converter               = new Converter();
    static ExceptionCalculation exception    = new ExceptionCalculation();

    public static void main(String [] args) {

        String inputText      = inputCalculateText();
        String[] inputNumbers = splitInputNumber.split(inputText);

        if (!exception.testing(inputNumbers)) {
            throw new NumberFormatException();
        } else {
            int[] inputNumbersInt = converter.toInt(inputNumbers);
            int oneNumber = inputNumbersInt[0];
            int twoNumber = inputNumbersInt[1];
            OperationType operationType = (OperationType.get(inputText));
            int resultInteger = calculation.execute(oneNumber, twoNumber, operationType);
            exception.resultLessThanZero(resultInteger);
            System.out.println("Результат: " + resultInteger);
        }
    }

    public static String calculation(String inputText){
        String[] inputNumbers = splitInputNumber.split(inputText);
        int[] inputNumbersInt = converter.toInt(inputNumbers);
        int oneNumber = inputNumbersInt[0];
        int twoNumber = inputNumbersInt[1];
        OperationType operationType = (OperationType.get(inputText));
        int resultInteger = calculation.execute(oneNumber, twoNumber, operationType);
        String resultString = Integer.toString(resultInteger);
        exception.resultLessThanZero(resultInteger);
        return resultString;
    }

    public static String inputCalculateText(){
        System.out.println("Введите десятичную или римскую цифру:");
        String inputText = new String();
        inputText += scanner.nextLine();
        return inputText;
    }
}

