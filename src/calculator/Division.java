
package calculator;

public class Division implements Operation {
    @Override
    public double execute(double operand1, double operand2) {
        if (!DecimalUtils.hasAtMostThreeDecimalPlaces(operand1) || !DecimalUtils.hasAtMostThreeDecimalPlaces(operand2)) {
            throw new IllegalArgumentException("Operands must have at most 3 decimal places");
        }
        if (operand2 == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return Math.round((operand1 / operand2) * 1000.0) / 1000.0;
    }
}
