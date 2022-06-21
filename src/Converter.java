
public class Converter {

    int[] toInt(String[] inputNumbers) {
        String oneNumber = inputNumbers[0];
        String twoNumber = inputNumbers[1];
        int oneNumberInt;
        int twoNumberInt;
        switch (DefineOperasand.getOperasand(oneNumber)){
            case ROMAN:
                oneNumberInt = RomanNumerals.converterToNumber(oneNumber);
                twoNumberInt = RomanNumerals.converterToNumber(twoNumber);
                break;
            case ARABIA:
                oneNumberInt = Integer.parseInt(oneNumber);
                twoNumberInt = Integer.parseInt(twoNumber);
                break;
            case NONE:;
                oneNumberInt = 0;
                twoNumberInt = 0;
                break;
            default:
                oneNumberInt = 0;
                twoNumberInt = 0;
                break;
        }
        int[] result = new int[] {oneNumberInt, twoNumberInt};
        return result;
    }
}
