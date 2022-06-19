import sun.tools.tree.BooleanExpression;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionCalculation {

    public void exeptions(String[] inputString) throws FileNotFoundException {

        if (this.twoNumbersOfRoman(inputString) || this.twoNumbersOfIntegers(inputString)) {

        } else {
            throw new FileNotFoundException();
        }
    }

    private boolean twoNumbersOfRoman (String[] inputString) {
        //проверка оба номера римских
        boolean twoValue = RomanNumerals.isRomanNumerals(inputString[0]);
        boolean oneValue = RomanNumerals.isRomanNumerals(inputString[1]);

        if (oneValue && twoValue) {
            return true;
        }  else {
            System.out.println("т.к. используются одновременно разные системы счисления");
            return false;
        }
    }

    private boolean twoNumbersOfIntegers (String[] inputString)  {
        //проверка оба номера арабские
        try {
            int twoValue = Integer.parseInt(inputString[1]);
            int oneValue = Integer.parseInt(inputString[0]);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("т.к. используются одновременно разные системы счисления");
        }
        return false;
    }
}
//III+III
//3+3
//3+III
//III+3