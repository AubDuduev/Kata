
public enum OperationType {

    PLUS('+'),
    MINUS('-'),
    DIVIDE('/'),
    MULTIPLY('*'),
    NONE('-');

    char operation;

    OperationType(char operation) {
        this.operation = operation;
    }

    static OperationType converter(char operationString) {
       switch (operationString){
           case '+':
                return PLUS;
           case '-':
               return MINUS;
           case '/':
               return DIVIDE;
           case '*':
               return MULTIPLY;
       }
        return NONE;
    };

    static OperationType get(String operationString) {
        if (true == operationString.contains("+")) {
            return PLUS;
        } else if (true == operationString.contains("-")) {
            return MINUS;
        } else if (true == operationString.contains("/")) {
            return DIVIDE;
        } else if (true == operationString.contains("*")) {
            return MULTIPLY;
        }
        return NONE;
    };

    int plus(int left, int right) {
        int result = left + right;
        return result;
    }

    int minus(int left, int right) {
        int result = left - right;
        return result;
    }

    int divide(int left, int right) {
        int result = left / right;
        return result;
    }

    int multiply(int left, int right) {
        int result = left * right;
        return result;
    }
};
