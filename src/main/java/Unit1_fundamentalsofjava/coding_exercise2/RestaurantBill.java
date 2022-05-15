package Unit1_fundamentalsofjava.coding_exercise2;
import java.util.Scanner;
public class RestaurantBill {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("what is the total amount of bill?");
        double totalBill = scanner.nextDouble();
        System.out.println("Number of people");
        int numberOfPeople = scanner.nextInt();

        double eachPay= totalBill/numberOfPeople;
        System.out.println("Total bill is " + totalBill + " $");
        System.out.println("Number of people: " + numberOfPeople);
        System.out.println("The amount per person is " + eachPay + "$");

    }
}
