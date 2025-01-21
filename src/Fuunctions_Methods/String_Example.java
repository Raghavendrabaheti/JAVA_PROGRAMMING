package Fuunctions_Methods;

import java.util.Scanner;

public class String_Example {
    public static void main(String[] args) {
//    String messages = say();
//        System.out.println(messages);
        Scanner sc = new Scanner(System.in);
        String naam = sc.next();
        String message = greet(naam);
        System.out.println(message);
    }

    private static String greet(String name) {
        String message = "Hello " +name ;
        return message;
    }

    static String say(){
        String greeting = "how are you";
        return greeting;
    }
}
