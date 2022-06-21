import java.util.Scanner;

public enum DefineOperasand {

    ROMAN, ARABIA, NONE;

    public static DefineOperasand getOperasand(String stringNumber) {
        if (new Scanner(stringNumber).hasNextInt()) {
            return ARABIA;
        } else if (new Scanner(stringNumber).hasNextLine()) {
            return ROMAN;
        } else {
           return NONE;
        }
    }
}
