package Basics.Question;
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        //Take 2 numbers as input and print the largest number.
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number1");
        int num1 = sc.nextInt();
        System.out.println("enter the number2");
        int num2 = sc.nextInt();

        if(num1 > num2){
            System.out.println("num1 is larger then num2");
        }
        else {
            System.out.println("num2 is larger then num1");
        }


    }
}
