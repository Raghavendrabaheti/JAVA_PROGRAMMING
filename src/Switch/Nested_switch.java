package Switch;

import java.util.Scanner;

public class Nested_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empID = sc.nextInt();
        String Department = sc.next();

        switch (empID) {
            case 1 -> System.out.println("Raghavendra baheti");
            case 2 -> System.out.println("Aditya");
            case 3 -> {
                System.out.println("Emp number 3");
                switch (Department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("no department");
                }
            }
            default -> System.out.println("Invalid EmpID");
        }
    }
}
