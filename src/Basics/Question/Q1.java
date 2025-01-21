package Basics.Question;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Check if the number is even or odd
        if (n % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

        sc.close(); // Close the scanner to prevent resource leaks
    }
}