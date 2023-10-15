import java.util.HashSet;
import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        scanner.close();

        boolean isPangram = isPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        // Convert the input string to lowercase to handle case insensitivity
        input = input.toLowerCase();

        // Create a set to store unique letters
        HashSet<Character> letterSet = new HashSet<>();

        // Iterate through each character in the input
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                letterSet.add(c);
            }
        }

        // Check if the size of the set is 26 (the number of letters in the English alphabet)
        return letterSet.size() == 26;
    }
}
