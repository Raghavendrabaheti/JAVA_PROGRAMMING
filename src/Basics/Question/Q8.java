package Basics.Question;
import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        // To find out whether the given String is Palindrome or not.
        Scanner sc = new Scanner(System.in);
        int reminder, re=0 , number, o;
        number = sc.nextInt();
        o = number;
        while( number != 0 ){
            reminder = number % 10;
            re = re *10 +reminder;
            number/=10;
        }
        if (o == re) {
            System.out.println("The number " + o + " is a palindrome.");
        } else {
            System.out.println("The number " + o + " is not a palindrome.");
        }
    }
}
