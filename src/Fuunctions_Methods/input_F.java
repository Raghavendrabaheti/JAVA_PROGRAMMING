package Fuunctions_Methods;

import java.util.Scanner;

public class input_F {
    public static void main(String[] args) {
//       int ans =  sum2();
//        System.out.println(ans);


        int ans = sum3(22,33);
        System.out.println(ans);
    }
    // pass the value of method when you are calling the method in main()
    static int sum3(int a, int b){
        int sum = a+b;
        return sum;
    }


    // return the value
    static int sum2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int n1= sc.nextInt();
        System.out.print("Enter First Number: ");
        int n2= sc.nextInt();
        int sum = n1+n2;
        return sum;
    }
    static void sum (){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int n1= sc.nextInt();
        System.out.print("Enter First Number: ");
        int n2= sc.nextInt();
        int sum = n1+n2;
        System.out.println("Sum of this is " +sum);
         /*
                return_type name(arguments) {
                //body
                return statement;
                }
         */
    }
}
