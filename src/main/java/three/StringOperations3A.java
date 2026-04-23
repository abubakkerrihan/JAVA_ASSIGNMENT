package three;

import java.util.*;

public class StringOperations3A {
    public static void main(String[] args) {

        // String Creation
        String str1 = "Hello";
        String str2 = "World";

        // Basic Operations
        System.out.println("String1: " + str1);
        System.out.println("String2: " + str2);

        // Length & Character Access
        System.out.println("Length: " + str1.length());
        System.out.println("Char at index 1: " + str1.charAt(1));

        // String Comparison
        System.out.println("Equals: " + str1.equals(str2));
        System.out.println("Equals Ignore Case: " + str1.equalsIgnoreCase("hello"));

        // Searching
        System.out.println("Index of 'l': " + str1.indexOf('l'));
        System.out.println("Contains 'He': " + str1.contains("He"));

        // Substring
        System.out.println("Substring(1,4): " + str1.substring(1, 4));

        // Modification
        System.out.println("Replace l->x: " + str1.replace("l", "x"));

        // Whitespace Handling
        String str3 = "   Java Programming   ";
        System.out.println("Trimmed: '" + str3.trim() + "'");

        // Concatenation
        String result = str1 + " " + str2;
        System.out.println("Concatenation: " + result);

        // Splitting
        String sentence = "Java is easy";
        String[] arr = sentence.split(" ");
        System.out.println("Split words:");
        for (String word : arr) {
            System.out.println(word);
        }

        // StringBuilder
        StringBuilder sb = new StringBuilder("AIET");
        sb.append(" College");
        System.out.println("StringBuilder: " + sb);

        // Formatting
        String formatted = String.format("Name: %s, Marks: %d", "John", 90);
        System.out.println("Formatted: " + formatted);

        // Email Validation
        String email = "student@gmail.com";
        if (email.contains("@") && email.startsWith("student") && email.endsWith(".com")) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }
}