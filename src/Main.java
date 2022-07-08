import java.io.FileNotFoundException;
import java.util.Scanner;

import java.util.Scanner;

public class Main {
    //считывает данные с консоли
    static Scanner scanner                    = new Scanner(System.in);
    static Calculation calculation            = new Calculation();
    static ParserInputNumber parserInputNumber = new ParserInputNumber();
    static Converter converter                = new Converter();
    static ExceptionCalculation exception     = new ExceptionCalculation();

    public static void main(String [] args) {

        String inputText = inputCalculateText();

        String resultString = calculation(inputText);
        System.out.println(resultString);
    }

    public static String calculation(String inputText){
        String[] inputNumbers = parserInputNumber.split(inputText);
        if (!exception.testing(inputNumbers)) {
            throw new NumberFormatException();
        } else {
            int[] inputNumbersInt = converter.toInt(inputNumbers);
            int oneNumber = inputNumbersInt[0];
            int twoNumber = inputNumbersInt[1];
            OperationType operationType = (OperationType.get(inputText));
            int resultInteger   = calculation.execute(oneNumber, twoNumber, operationType);
            exception.resultLessThanZero(resultInteger);
            DefineOperasand type = DefineOperasand.getOperasand(inputNumbers[0]);
            switch (type) {
                case ARABIA:
                    return "Результат: " + resultInteger;
                case ROMAN:
                    RomanNumerals resultRoman = RomanNumerals.converterToRoman(resultInteger);
                    return "Результат: " + resultRoman;
                default:
                    return "";
            }
        }
    }

    public static String inputCalculateText(){
        System.out.println("Введите десятичную или римскую цифру:");
        String inputText = new String();
        inputText += scanner.nextLine();
        return inputText;
    }
}
//III+III
//3+3
//3+III
//III+3
