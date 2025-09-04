import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int target = random.nextInt(100) + 1; // Random number between 1 and 100
        int guess;

        do {
            System.out.print("Guess a number between 1 and 100: ");
            guess = scanner.nextInt();

            if (guess < target) {
                System.out.println("Too low! Try again.");
            } else if (guess > target) {
                System.out.println("Too high! Try again.");
            }
            System.out.println("the number is: "+target);
        } while (guess != target);

        System.out.println("Congratulations! You guessed the number.");
        scanner.close();
    }
}
