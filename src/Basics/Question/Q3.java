package Basics.Question;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Principle");
        int p = sc.nextInt();
        System.out.println("time");
        int t = sc.nextInt();
        System.out.println("rate");
        int r = sc.nextInt();

        int SI = p * t * r;

        System.out.println(SI);
    }
}
