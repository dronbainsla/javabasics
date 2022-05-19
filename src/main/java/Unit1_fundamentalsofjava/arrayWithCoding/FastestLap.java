package Unit1_fundamentalsofjava.arrayWithCoding;

import java.util.Scanner;

public class FastestLap {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Number of laps\n");

        int numOfLaps=scanner.nextInt();

        double[] lapTime = new double[numOfLaps];

        for(int i=0; i<numOfLaps; i++){
            System.out.print("Please enter lap time: ");
            lapTime[i]=scanner.nextDouble();

            }

        double fastestTime =lapTime[0];
        for (int i=1; i<lapTime.length; i++){
            if (lapTime[i]<fastestTime)
            {
                fastestTime=lapTime[i];
            }
        }
        System.out.println("Fastest lap: " + fastestTime);

    }
}
