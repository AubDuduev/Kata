
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

    int number;

    RomanNumerals(int number) {
        this.number = number;
    }

    int toNumber() {
        return this.number;
    }

    static int converter(String romanString) {
        RomanNumerals romanNumber = RomanNumerals.valueOf(romanString);
        return romanNumber.number;
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

