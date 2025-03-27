import java.util.*;

public class Alphabetizer {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide input strings as arguments.");
            return;
        }

        for (String input : args) {
            System.out.println(alphabetize(input));
        }
    }

    public static String alphabetize(String input) {
        List<Character> letters = new ArrayList<>();

        // Filter alphabetic characters
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                letters.add(c);
            }
        }

        // Sort using case-insensitive comparison
        letters.sort(Comparator.comparingInt(Character::toLowerCase));

        // Build result
        StringBuilder result = new StringBuilder();
        for (char c : letters) {
            result.append(c);
        }

        return result.toString();
    }
}