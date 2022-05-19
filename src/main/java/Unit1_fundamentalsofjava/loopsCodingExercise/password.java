package Unit1_fundamentalsofjava.loopsCodingExercise;

import java.util.Scanner;

public class password {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String password;
        int i=0;

        do {
            System.out.print("Please enter your password: ");
            password = scanner.next();
            i++;
        } while (!password.equals("test1234"));
        System.out.println("Welcome");
        }


    }

