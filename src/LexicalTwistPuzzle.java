import java.util.Scanner;

/**
 * Lexical Twist Puzzle Application
 *
 * UC8: Combine words and count vowels & consonants
 */

public class LexicalTwistPuzzle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lexical Twist Puzzle");

        System.out.println("Enter first word:");
        String firstWord = scanner.nextLine();

        System.out.println("Enter second word:");
        String secondWord = scanner.nextLine();

        if (!WordValidator.isValidWord(firstWord))
            return;

        if (!WordValidator.isValidWord(secondWord))
            return;

        LexicalAnalyzer.processWords(firstWord, secondWord);
    }
}

