package Basics.Question;
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, original, digits = 0, r, sum = 0;

        System.out.println("Enter a number to check if it is an Armstrong number:");
        n = sc.nextInt();
        original = n;

        // Count the number of digits in the number
        int temp = n;
        while (temp != 0) {
            temp /= 10;
            digits++;
        }

        // Calculate the sum of the digits raised to the power of 'digits'
        while (n != 0) {
            r = n % 10;
            sum += Math.pow(r, digits); // Raise the digit to the power of 'digits' and add to sum
            n /= 10;
        }

        // Check if the sum equals the original number
        if (sum == original) {
            System.out.println("The number " + original + " is an Armstrong number.");
        } else {
            System.out.println("The number " + original + " is not an Armstrong number.");
        }
    }
}