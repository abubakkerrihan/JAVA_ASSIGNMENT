package twoA;

import java.util.*;

public class StringOperationsDemo {
    public static void main(String[] args) {

        // 1. String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // 2. Length and Character Access
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 1: " + str1.charAt(1));

        // 3. String Comparison
        System.out.println("Equals: " + str1.equals(str2));
        System.out.println("Equals Ignore Case: " + str1.equalsIgnoreCase("hello"));

        // 4. String Searching
        System.out.println("Index of 'l': " + str1.indexOf('l'));
        System.out.println("Contains 'He': " + str1.contains("He"));

        // 5. Substring Operations
        System.out.println("Substring (1 to 4): " + str1.substring(1, 4));

        // 6. String Modification
        String replaced = str1.replace("l", "x");
        System.out.println("After replace: " + replaced);

        // 7. Whitespace Handling
        String str3 = "   Java Programming   ";
        System.out.println("Before trim: '" + str3 + "'");
        System.out.println("After trim: '" + str3.trim() + "'");

        // 8. String Concatenation
        String concat = str1.concat(" ").concat(str2);
        System.out.println("Concatenated string: " + concat);

        // 9. String Splitting
        String sentence = "Java is fun to learn";
        String[] words = sentence.split(" ");
        System.out.println("Splitted words:");
        for (String word : words) {
            System.out.println(word);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("AIET");
        sb.append(" College");
        System.out.println("StringBuilder: " + sb);

        // 11. String Formatting
        String formatted = String.format("Name: %s, Age: %d", "John", 20);
        System.out.println("Formatted String: " + formatted);

        // 12. Email Validation
        String email = "example@gmail.com";
        if (email.contains("@") && email.startsWith("example") && email.endsWith(".com")) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }
}