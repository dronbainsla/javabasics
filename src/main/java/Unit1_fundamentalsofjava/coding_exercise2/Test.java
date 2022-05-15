package Unit1_fundamentalsofjava.coding_exercise2;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First Name: ");
        String firstName = scanner.next();

        System.out.print("Age: ");
        int age = scanner.nextInt();

        System.out.print("Amount of money in your pocket: $");
        double money = scanner.nextDouble();

        System.out.println();

        double moneyNeeded = Math.ceil(money) - money;

        System.out.println("Your name is " + firstName + " and you name is " + firstName.length() + " characters long.");
        System.out.println("You have lived " + age+ " years. In another " + age+ " years, you will be " + age*2 + " years old" );
        System.out.format("You have $%.2f on you and need $%.2f.", money, moneyNeeded);
    }
}
