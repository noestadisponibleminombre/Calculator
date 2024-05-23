
package calculator;

public class Calculator {
    private OperationFactory operationFactory;

    public Calculator(OperationFactory operationFactory) {
        this.operationFactory = operationFactory;
    }

    public double add(double a, double b) {
        return operationFactory.getOperation("Addition").execute(a, b);
    }

    public double subtract(double a, double b) {
        return operationFactory.getOperation("Subtraction").execute(a, b);
    }

    public double multiply(double a, double b) {
        return operationFactory.getOperation("Multiplication").execute(a, b);
    }

    public double divide(double a, double b) {
        return operationFactory.getOperation("Division").execute(a, b);
    }

    public double power(double a, double b) {
        return operationFactory.getOperation("Power").execute(a, b);
    }
}
