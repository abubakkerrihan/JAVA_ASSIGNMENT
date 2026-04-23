package three;
public class CapitalizeWords {

    public static String capitalizeWords(String str) {
        String[] words = str.split(" ");
        String result = "";

        for (String word : words) {
            if (word.length() > 0) {
                result += Character.toUpperCase(word.charAt(0)) 
                        + word.substring(1).toLowerCase() + " ";
            }
        }
        return result.trim();
    }

    public static void main(String[] args) {
        String input = "java programming is fun";
        System.out.println("Capitalized: " + capitalizeWords(input));
    }
}