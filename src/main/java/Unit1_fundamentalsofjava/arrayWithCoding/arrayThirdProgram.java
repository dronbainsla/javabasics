package Unit1_fundamentalsofjava.arrayWithCoding;

public class arrayThirdProgram {
    public static void main(String[] args) {
        //Create an array of five doubles and give each element some value.
        // Calculate the sum of all the elements and print the result.
        // Calculate the mean/average of the all the elements and print that too.

        double[] arrayOfDoubles= {10.2,45.4,52.34,23.56,78.3};
        double sum=0;
        for (int i=0; i<arrayOfDoubles.length; i++){
            sum= sum + arrayOfDoubles[i];

        }
        System.out.println("Sum of the array elements is : " + sum);

        double mean= sum/arrayOfDoubles.length;
        System.out.println("Mean of the array is : " +mean);

    }
}
