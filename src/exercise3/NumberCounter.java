package exercise3;

import java.util.Scanner;

public class NumberCounter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int positiveCount = 0;
        int negativeCount = 0;
        double sum = 0;

        System.out.println("Enter number: ");
        int number = input.nextInt();
        
        while (number != 0) {
         if (number > 0) {
         positiveCount++;
         } else {  
         negativeCount++;
         } 
        
        sum = sum + number;

        System.out.println("Enter number: ");
        number = input.nextInt();
        }
        double average = sum / (positiveCount + negativeCount);
        
        System.out.println("Positive number: " + positiveCount);
        System.out.println("Negative number: " + negativeCount);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }

}