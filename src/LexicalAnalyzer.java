public class LexicalAnalyzer {

    public static void processWords(String firstWord, String secondWord) {

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
                    if ("AEIOU".indexOf(ch) != -1)
                        vowelCount++;
                    else
                        consonantCount++;
                }
            }

            if (vowelCount > consonantCount) {

                String uniqueVowels = "";

                for (char ch : combined.toCharArray()) {
                    if ("AEIOU".indexOf(ch) != -1 &&
                            uniqueVowels.indexOf(ch) == -1) {

                        uniqueVowels += ch;
                        if (uniqueVowels.length() == 2)
                            break;
                    }
                }

                System.out.println(uniqueVowels);

            } else if (consonantCount > vowelCount) {

                String uniqueConsonants = "";

                for (char ch : combined.toCharArray()) {
                    if (ch >= 'A' && ch <= 'Z' &&
                            "AEIOU".indexOf(ch) == -1 &&
                            uniqueConsonants.indexOf(ch) == -1) {

                        uniqueConsonants += ch;
                        if (uniqueConsonants.length() == 2)
                            break;
                    }
                }

                System.out.println(uniqueConsonants);

            } else {
                System.out.println(
                        "Vowels and consonants are equal");
            }
        }
    }
}
