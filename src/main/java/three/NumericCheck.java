package three;

public class NumericCheck {

    public static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) return false;

        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "12345";
        System.out.println("Is Numeric? " + isNumeric(input));
    }
}