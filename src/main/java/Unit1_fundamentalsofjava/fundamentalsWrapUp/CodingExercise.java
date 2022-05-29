package Unit1_fundamentalsofjava.fundamentalsWrapUp;


import java.util.Scanner;

public class CodingExercise {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numOfStudents;
        System.out.print("Please enter number of students: ");
        numOfStudents= scanner.nextInt();
        int maxScore;
        System.out.print("Please enter the maximum score a student can get: ");
        maxScore=scanner.nextInt();
        int[] scores=new int[numOfStudents];

        for (int i=0; i<scores.length; i++){
            System.out.print("Enter the score for student " +(i+1) + ": ");
            scores[i]=scanner.nextInt();
        }
        System.out.println("Stats");

        int sum=0;
        for (int i=0;i<scores.length;i++){
            double studentScore= scores[i];
            System.out.println("Score of student " +(i+1)+": " + scores[i] +" out of " +maxScore);
            double percentage=((double) scores[i]/maxScore)*100;
            System.out.println("Percentage of student " +(i+1) +" = " + percentage + " %");
            sum+= studentScore;
        }

        double mean=((double) sum/scores.length);
        double meanPercentage = (mean / maxScore) * 100;
        System.out.println("Mean: " + mean + "/" + maxScore + " (" + meanPercentage + "%)");
    }
}
