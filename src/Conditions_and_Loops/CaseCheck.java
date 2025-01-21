package Conditions_and_Loops;
import java.util.Scanner;
public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);
//        System.out.println(sc.next().trim());
        if(ch >= 'a' && ch <= 'z'){
            System.out.println("Lowercase");
        }
        else {
            System.out.println("Uppercase");
        }
        System.out.println(ch);

//        String word = "hello";
//        System.out.println(word.charAt(2));
    }
}
