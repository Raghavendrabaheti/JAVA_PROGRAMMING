package Basics.Question;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // To calculate Fibonacci Series up to n numbers        // 0,1,1,2,3,5,8,13,21,34,55
        System.out.print("Enter the number of terms: ");
        int number = sc.nextInt();
        int first = 0, second = 1;
        int next;
        for (int i=0; i < number; i++){
           if(i==0){
               System.out.print(first);
           } else if (i == 1) {
               System.out.print(", " +second);
           }
           else {
               next = first + second;
               System.out.print(", " +next);
               first = second;
               second = next;
           }
        }

    }
}