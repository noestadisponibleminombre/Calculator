package calculator;

public class DecimalUtils {
    public static boolean hasAtMostThreeDecimalPlaces(double number) {
        String[] parts = String.valueOf(number).split("\\.");
        return parts.length < 2 || parts[1].length() <= 3;
    }
}
