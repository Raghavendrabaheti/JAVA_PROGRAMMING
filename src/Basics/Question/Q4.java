package Basics.Question;
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        double result;

        if (operator == '+'){
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        }
        else if (operator == '*'){
            result = num1 * num2;
        }
        else if(operator == '/'){if (num2 != 0) {
            result = num1 / num2;
        } else {
            System.out.println("Error! Division by zero.");
            sc.close();
            return;
        }
        } else {
            System.out.println("Invalid operator!");
            sc.close();
            return;
        }

        System.out.println("The result is: " + result);
        sc.close();
    }
    }
