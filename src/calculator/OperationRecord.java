package calculator;

import java.time.LocalDateTime;

public class OperationRecord {
    private double operand1;
    private double operand2;
    private String operator;
    private double result;
    private LocalDateTime timestamp;

    public OperationRecord(double operand1, double operand2, String operator, double result) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operator = operator;
        this.result = result;
        this.timestamp = LocalDateTime.now();
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return operand1 + " " + operator + " " + operand2 + " = " + result;
    }
}
