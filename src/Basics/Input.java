package Basics;
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hey, How are you Today!");
        System.out.println(sc.nextLine());  //next = take only single word

        int rollno= sc.nextInt();
        System.out.println("Your rollno is " + rollno);

        float marks = sc.nextFloat();
        System.out.println("Your marks is " + marks);


    }
}
