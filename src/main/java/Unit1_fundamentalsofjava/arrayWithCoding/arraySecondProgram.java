package Unit1_fundamentalsofjava.arrayWithCoding;

public class arraySecondProgram {
    public static void main(String[] args) {
        //Use a loop to populate an array with integers from 1 to 20.
        // Use another loop to print the contents of the array (the elements) backwards.

        int[] intArr = new int[20];

        for (int i = 1; i <= intArr.length; i++) {
            System.out.println(i);
        }
        for (int i = intArr.length; i > 0; i--) {
            System.out.println(i);
        }
    }

}
