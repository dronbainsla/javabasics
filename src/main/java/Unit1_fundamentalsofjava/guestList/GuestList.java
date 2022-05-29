package Unit1_fundamentalsofjava.guestList;

import java.util.Scanner;

public class GuestList {
    static String[] guests = new String[10];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        insertTestNames();
        do {
            displayGuests();
            displayMenu();
            int option= getOption();



            if (option == 1) {
                addGuest();
            } else if (option==2) {
                insertGuest();

            } else if (option==3) {
                renameGuest();

            } else if (option == 4) {
                removeGuest();
            }
            else if (option == 5) {
                System.out.println("Exiting...");
                break;
            }
        } while (true);
    }

    static void displayGuests()

    {
        System.out.println("________________________________\n- Guests -\n");
        boolean isEmpty = true;
        for (int i = 0; i < guests.length; i++) {
            if (guests[i]!=null){
                System.out.println((i+1) + ". " + guests[i]);
                isEmpty=false;
            }
//            System.out.print(i+1 + ". ");
//            System.out.print(guests[i] == null ? "--\n" : guests[i] + "\n");
//                OR
//            if (guests[i]==null){
//                        System.out.println("--");
//                    }
//                    else {
//                        System.out.println(guests[i]);
//                    }
        }
        if (isEmpty){
            System.out.println("Guest list is empty");
        }
    }
    static void displayMenu()
    {
        System.out.println();
        System.out.println("________________________________\n- Menu - \n");
        System.out.println("1- Add guest: ");
        System.out.println("2- Insert Guest");
        System.out.println("3- Rename guest");
        System.out.println("4- Remove guest: ");
        System.out.println("5- Exit");
    }
    static int getOption(){
        System.out.print("Select an option- ");
        int option = scanner.nextInt();
        scanner.nextLine();
        System.out.println();
        return option;
    }

    static void addGuest(){
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] == null) {

                System.out.print("Name: ");
                guests[i] = scanner.nextLine();
                break;
            }
        }

    }
    static void insertGuest(){
        System.out.print("Number: ");
        int num = scanner.nextInt();
        scanner.nextLine();
        if (num>=1 && num<=10 && guests[num-1]!=null) {

            System.out.print("Name: ");
            String name = scanner.nextLine();

            for (int i=guests.length-1; i>num-1; i--)
            {
                guests[i]=guests[i-1];
            }
            guests[num - 1] = name;
        }
        else {
            System.out.println("\nPlease enter a valid number\n");
        }

    }
    static void renameGuest(){

            System.out.print("Number: ");
            int num = scanner.nextInt();
            scanner.nextLine();
        if (num>=1 && num<=10 && guests[num-1]!=null) {

            System.out.print("Name: ");
            String name = scanner.nextLine();

            guests[num - 1] = name;
        }
        else {
            System.out.println("\nPlease enter a valid number\n");
        }
    }
    static void removeGuest(){
//        System.out.print("Name: ");
//        String name = scanner.next();
//        for (int i = 0; i < guests.length; i++) {
//            if (guests[i] != null && guests[i].equals(name)) {
//                guests[i] = null;
//                break;
//            }
//        }
        // OR removing a name by number we can also use
        System.out.print("Enter Number: ");
        int num = scanner.nextInt();
        if (num>=1 && num<=10 && guests[num-1]!=null) {
            guests[num - 1] = null;

            String[] temp = new String[guests.length];
            int ti = 0;
            for (int i = 0; i < guests.length; i++) {
                if (guests[i] != null) {
                    temp[ti] = guests[i];
                    ti++;
                }
            }
            guests = temp;
        }
        else {
            System.out.println("\nPlease enter a valid number\n");
        }
    }
    static void insertTestNames(){
        guests[0] = "Dron";
        guests[1] = "Yogesh";
        guests[2] = "Praveen";
        guests[3] = "Sumit";
        guests[4] = "Sheetal";

    }

}
