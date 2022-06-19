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

        try {
            exception.exeptions(inputNumbers);
        } catch (FileNotFoundException error) {
            error.printStackTrace();
        }

        int[] inputNumbersInt       = converter.toInt(inputNumbers);
        int oneNumber               = inputNumbersInt[0];
        int twoNumber               = inputNumbersInt[1];
        OperationType operationType = (OperationType.get(inputText));
        int result                  = calculation.execute(oneNumber, twoNumber, operationType);
        System.out.println("Результат: " + result);
    }

    public static String inputCalculateText(){
        System.out.println("Введите десятичную или римскую цифру:");
        String inputText = new String();
        inputText += scanner.nextLine();
        return inputText;
    }
}

