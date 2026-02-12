import java.util.Scanner;

/**
 * Lexical Twist Puzzle Application
 *
 * UC6: Combine words and count vowels & consonants
 */
public class LexicalTwistPuzzle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lexical Twist Puzzle");

        System.out.println("Enter first word:");
        String firstWord = scanner.nextLine();

        System.out.println("Enter second word:");
        String secondWord = scanner.nextLine();

        if (firstWord.contains(" ")) {
            System.out.println(firstWord + " is an invalid word");
            return;
        }

        if (secondWord.contains(" ")) {
            System.out.println(secondWord + " is an invalid word");
            return;
        }

        String reversed =
                new StringBuilder(firstWord)
                        .reverse()
                        .toString();

        boolean isReverseMatch =
                reversed.equalsIgnoreCase(secondWord);

        if (isReverseMatch) {

            String transformed =
                    reversed.toLowerCase()
                            .replaceAll("[aeiou]", "@");

            System.out.println(transformed);

        } else {

            String combined =
                    (firstWord + secondWord).toUpperCase();

            int vowelCount = 0;
            int consonantCount = 0;

            for (char ch : combined.toCharArray()) {

                if (ch >= 'A' && ch <= 'Z') {
                    if ("AEIOU".indexOf(ch) != -1) {
                        vowelCount++;
                    } else {
                        consonantCount++;
                    }
                }
            }

            // Counts used in next UC
        }
    }
}
