package threeB;

public class RemoveWhitespace {

    public static String removeWhitespace(String str) {
        return str.replaceAll("\\s", "");
    }

    public static void main(String[] args) {
        String str = "Java is fun";
        System.out.println("After removing spaces: " + removeWhitespace(str));
    }
}