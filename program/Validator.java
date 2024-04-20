public class Validator {
    public static boolean isNumeric(String str) {
        try {
            double d = Double.parseDouble(str);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    public static boolean isInRange(int num) {
        return num >= -32768 && num <= 32767;
    }

    public static boolean isValidOperator(char operator) {
        return operator == '1' || operator == '2' || operator == '3' || operator == '4';
    }

    public static boolean isValidDivision(double angka2) {
        return angka2 != 0;
    }
}
