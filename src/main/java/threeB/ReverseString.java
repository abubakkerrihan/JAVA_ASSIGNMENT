package threeB;

public class ReverseString {

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String str = "Hello";
        System.out.println("Reversed: " + reverseString(str));
    }
}