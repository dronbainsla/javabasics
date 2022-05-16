package Unit1_fundamentalsofjava.coding_exercise3;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessingGame {
    public static void main(String[] args) {
        System.out.println("Guess The Number");

        System.out.print("Your Guess: ");
        Scanner scanner = new Scanner(System.in);
        int guess = scanner.nextInt();
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 6);
        if (randomNumber == guess) {
            System.out.println("Aren't you lucky!!");
        } else {
            System.out.println("Wrong! Have another go.");
            System.out.print("Your guess is: ");
            guess = scanner.nextInt();
            if (randomNumber == guess) {
                System.out.println("Aren't you lucky!!");
            } else {
                System.out.println("Better Luck next time");
            }
        }


    }
}
