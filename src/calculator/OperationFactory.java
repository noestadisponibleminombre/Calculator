
package calculator;

public class OperationFactory {
    public Operation getOperation(String operationType) {
        switch (operationType) {
            case "Addition":
                return new Addition();
            case "Subtraction":
                return new Subtraction();
            case "Multiplication":
                return new Multiplication();
            case "Division":
                return new Division();
            case "Power":
                return new Power();
            default:
                throw new IllegalArgumentException("Invalid operation type");
        }
    }
}
