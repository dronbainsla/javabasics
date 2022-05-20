package Unit1_fundamentalsofjava.startingOfJava;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String userName=scanner.next();
        System.out.println(userName + " is a nice name.");

        System.out.println("How old are you?");
        int UserAge= scanner.nextInt();
        System.out.println("Your name is: " + userName + " \nYou are " + UserAge + " years old.");
    }
}
