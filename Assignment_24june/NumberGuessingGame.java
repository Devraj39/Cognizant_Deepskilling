/*
 * Name: Devraj Singh
 * Timestamp: 26-06-2026 08:14 PM
 */

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int target = random.nextInt(100) + 1;
        int guess;

        do {
            System.out.print("Enter your guess (1-100): ");
            guess = sc.nextInt();

            if (guess > target)
                System.out.println("Too High!");
            else if (guess < target)
                System.out.println("Too Low!");
            else
                System.out.println("Congratulations! You guessed the correct number.");
        } while (guess != target);

        sc.close();
    }
}