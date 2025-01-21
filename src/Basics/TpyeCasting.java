package Basics;
import java.util.Scanner;
public class TpyeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        float num = sc.nextFloat();
//        System.out.println(num);

        //Typecasting
//        int num1 = (int) (34.43f);
//        System.out.println(num1);

        //Automatic type promotion in expressions
//        int a =323;
//        byte b = (byte) (a);   // 257 % 256 = 1


//         byte a = 32;
//         byte b = 12;
//         byte c = 42;
//         int d = (a * b) / c;
//
//        System.out.println(d);

//        int number ='A';   // A=65 ASCII , a = 97
//        System.out.println(number);

        byte b = 50;
        char c = 'a';
        short s = 102;
        int i = 323;
        float f= 43.32f;
        double d = 03.32323f;
        double result = (f * d) + (i / c)  - (d * s);
        // float + integer + double = double
        System.out.println((f * d) + " " + (i / c)  + "" + (d * s));
        System.out.println(result);
    }

}
