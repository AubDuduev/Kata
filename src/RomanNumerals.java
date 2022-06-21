import com.sun.tools.javac.util.List;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Optional;
import java.util.stream.Stream;

public enum RomanNumerals {

    I(1),
    II(2),
    III(3),
    IV(4),
    V(5),
    VI(6),
    VII(7),
    VIII(8),
    IX(9),
    X(10);

    private String typeOfDay;

    public static Stream<RomanNumerals> stream() {
        return Stream.of(RomanNumerals.values());
    }

    int number;

    RomanNumerals(int number) {
        this.number = number;
    }

    int toNumber() {
        return this.number;
    }

    static int converterToNumber(String romanString) {
        RomanNumerals romanNumber = RomanNumerals.valueOf(romanString);
        return romanNumber.number;
    };

    static RomanNumerals converterToRoman(int numberInteger) {
        Stream<RomanNumerals> romans = Stream.of(RomanNumerals.values());
        Stream<RomanNumerals> numbers = romans.filter(d -> d.number == numberInteger);
        Optional<RomanNumerals> number = numbers.findFirst();
        return number.get();
    };

    static boolean isRomanNumerals(String inputString) {
        String[] roman = new String[] {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        for (String s : roman) {
            if (inputString.equals(s)) {
                return true;
            }
        }
        return false;
    }
}

