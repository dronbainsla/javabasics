package Unit1_fundamentalsofjava.coding_exercise3;
import java.util.Scanner;
public class CompareNumbers {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int x= scanner.nextInt();
        System.out.print("Enter the second number: ");
        int y= scanner.nextInt();

        if (x>y) {
            System.out.println("x is greater than y by " + (x-y));
                    }
        else if (x==y) {
            System.out.println("x is equals to y");
        }
        else {
            System.out.println("x is smaller than y by " + (y-x));
        }

    }
}
