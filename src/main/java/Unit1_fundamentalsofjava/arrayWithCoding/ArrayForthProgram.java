package Unit1_fundamentalsofjava.arrayWithCoding;

import java.util.Scanner;

public class ArrayForthProgram {
    public static void main(String[] args) {
        //Write a program which asks the user to enter their top five favourite foods and store their answers in a string array.
        // However, create the array, so it can only hold a maximum of three strings.
        // After the user enters the third item, print “No more memory available.”, then print out the contents of the array.

        //Note: For this program use scanner.nextLine() when grabbing input from the user.
        // This is because if the user enters a food such as “Ice cream” then scanner.next() will interpret that as two separate strings, due to the space.
        // This may result in the program storing “Ice” as one the user’s favourite foods, and “cream” as another.
        // However, if you use scanner.nextLine(), it will return the entire line as a single string.
        Scanner scanner = new Scanner(System.in);
        String[] topFoods = new String[3];
//        System.out.println("Please enter your top five favorite foods");
//        int  i=0;
//        do {
//            System.out.print("Top favorite food ");
//            topFoods[i]= scanner.next();
//            i++;
//        } while (i<topFoods.length);
//        System.out.println("No more memory");
//                           OR
        System.out.println("Enter your top five favorite food ");
        for (int i = 0; i < topFoods.length; i++) {

            System.out.print("Favourite food " + (i+1)+ " : ");
            topFoods[i] = scanner.nextLine();
        }
        System.out.println("No more memory");

        System.out.println("Your Favorite food are: ");

        for (int i = 0; i < topFoods.length; i++) {

            System.out.println(" - " + topFoods[i]);
        }
        //  OR

//        System.out.println("Enter your top five favourite foods.\n");
//
//        String[] foods = new String[3];
//        for (int i = 0; i < foods.length; i++) {
//            System.out.print("Food " + (i + 1) + ": ");
//            foods[i] = scanner.nextLine();
//        }
//        System.out.println("No more memory available.\n");
//
//        System.out.println("Your favourite foods are: ");
//        for (int i = 0; i < foods.length; i++) {
//            System.out.println(" - " + foods[i]);
//        }
    }
}

