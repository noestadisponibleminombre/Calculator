
package calculator;

public class OperationUtil {
    public static boolean hasMoreThanThreeDecimals(double number) {
        String text = Double.toString(Math.abs(number));
        int integerPlaces = text.indexOf('.');
        int decimalPlaces = text.length() - integerPlaces - 1;
        return decimalPlaces > 3;
    }

    public static double roundToThreeDecimals(double number) {
        return Math.round(number * 1000.0) / 1000.0;
    }
}
