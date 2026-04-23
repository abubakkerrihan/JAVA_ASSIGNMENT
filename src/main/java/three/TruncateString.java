package three;
public class TruncateString {

    public static String truncate(String str, int length) {
        if (str.length() <= length) {
            return str;
        }
        return str.substring(0, length) + "...";
    }

    public static void main(String[] args) {
        String input = "Java programming language";
        System.out.println("Truncated: " + truncate(input, 10));
    }
}