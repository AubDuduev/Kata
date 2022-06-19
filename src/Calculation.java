
public class Calculation {

     int execute(int num1, int num2, OperationType operationType){
        int result = 0;
        switch (operationType){
            case DIVIDE:
                result = operationType.divide(num1, num2);
                break;
            case PLUS:
                result = operationType.plus(num1, num2);
                break;
            case MINUS:
                result = operationType.minus(num1, num2);
                break;
            case MULTIPLY:
                result = operationType.multiply(num1, num2);
                break;
            default:
                System.out.println("Операция не верная. Повторите ввод.");
        }
        return result;
    }
}
