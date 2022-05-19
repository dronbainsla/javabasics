package Unit1_fundamentalsofjava.loopsCodingExercise;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessingGame {
    public static void main(String[] args) {
        System.out.println("Welcome to the Guessing Game");
        Scanner scanner=new Scanner(System.in);
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 101);
        int guess;
        int count=0;

        do{
            System.out.print("guess the number: ");
            guess=scanner.nextInt();
            count++;
            if (guess<randomNumber) {
                System.out.println("Higher");
            } else if (guess>randomNumber) {
                System.out.println("Lower");
            }
            else {
                System.out.println("You guessed the correct number");
                System.out.println("You guessed the number in " +count + " Tries.");
            }
        } while (guess!=randomNumber);

    }
}
