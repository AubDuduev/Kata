import sun.tools.tree.BooleanExpression;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionCalculation {

    public boolean testing(String[] inputString) {
        boolean isRoman      = this.twoNumbersOfRoman(inputString);
        boolean isIntegers   = this.twoNumbersOfIntegers(inputString);
        boolean isInputCount = this.inputDigitsGreaterTwo(inputString);

        //проверка чтоб цыфр было 2
        if (!isInputCount) {
            System.out.println("т.к. ввод более двух операндов");
            return false;
        }
        //проверка меньше 0 или больше 10 вводимые цыфры
        if (isRoman) {
            if (this.minAndMaxRoman(inputString)) {

            } else {
                System.out.println("т.к. числа не могу быть меньше 0 и больше 10");
                throw new NumberFormatException();
            }
        }
        //проверка меньше 0 или больше 10 вводимые цыфры
        if (isIntegers) {
            if (this.minAndMaxIntegers(inputString)) {

            } else {
                System.out.println("т.к. числа не могу быть меньше 0 и больше 10");
                throw new NumberFormatException();
            }
        }
        //проверка оба номера римских
        //проверка оба номера арабские
        if (isRoman || isIntegers || isInputCount) {
            return true;
        } else {
            System.out.println("т.к. используются одновременно разные системы счисления");
            throw new NumberFormatException();
        }
    }

    private boolean minAndMaxRoman(String[] inputString){
        int oneValue = RomanNumerals.converter(inputString[0]);
        int twoValue = RomanNumerals.converter(inputString[1]);

        if (oneValue >= 0 & twoValue <= 10) {
            return true;
        }
        return false;
    }

    private boolean minAndMaxIntegers(String[] inputString){
        int oneValue = Integer.parseInt(inputString[0]);
        int twoValue = Integer.parseInt(inputString[1]);

        if (oneValue >= 0 & twoValue <= 10 & twoValue >= 0) {
            return true;
        }
        return false;
    }

    private boolean twoNumbersOfRoman(String[] inputString){
        boolean oneValue = RomanNumerals.isRomanNumerals(inputString[1]);
        boolean twoValue = RomanNumerals.isRomanNumerals(inputString[0]);

        if (oneValue && twoValue) {
            return true;
        }  else {
            return false;
        }
    }

    private boolean twoNumbersOfIntegers(String[] inputString){
        try {
            int oneValue = Integer.parseInt(inputString[0]);
            int twoValue = Integer.parseInt(inputString[1]);
            return true;
        } catch (NumberFormatException error) {
            error.fillInStackTrace();
            return false;
        }
    }

    private boolean inputDigitsGreaterTwo(String[] inputString) {
        return (inputString.length == 2);
    }

    public void resultLessThanZero(int inputNumber) {
        if (inputNumber > 0) {

        } else {
            System.out.println("т.к. результат меньше нуля");
            throw new NumberFormatException();
        }
    }
}
//III+III
//3+3
//3+III
//III+3