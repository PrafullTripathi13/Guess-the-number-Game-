import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        // Create a random number generator
        Random random = new Random();
        // Generate a random number between 1 and 100
        int randomNumber = random.nextInt(9) + 1;

        Scanner scanner = new Scanner(System.in);
        int userGuess = 0;
        int attempts = 0;

        System.out.println("Welcome to the Guess the Number Game!");
        System.out.println("I have selected a number between 1 and 9.");
        System.out.println("Can you guess what it is?");

        // Keep asking the user to guess until they get the right number
        while (userGuess != randomNumber) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            attempts++;

            if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number.");
                System.out.println("It took you " + attempts + " attempts.");
            }
        }

        scanner.close();
    }
}
