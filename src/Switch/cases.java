package Switch;

import java.util.Scanner;

public class cases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();
        switch (fruit) {
            case "Mango", "mango" -> System.out.println("king of fruit");
            case "Apple" ,"apple" -> System.out.println("A sweet red fruit");
            case "Orange","orange" -> System.out.println("Round fruit");
            case "Banana", "banana" -> System.out.println("Monkeys fav fruit");
            default -> System.out.println("Please enter valid fruit name");
        }

        int days = sc.nextInt();
        switch (days)
        {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");

        }
    }
}