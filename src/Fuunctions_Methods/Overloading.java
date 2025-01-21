package Fuunctions_Methods;

public class Overloading {
    public static void main(String[] args) {
        fun("Raghavendra");
         fun(22);
         int ans = sum(24,33);
        System.out.println("The Addition of 2 number are  " +ans);
        int answer = sum(12,33,44);
        System.out.println("The Addition of 3 numbers are "+answer);
    }

    static int sum(int a,int b ){
        return a+b;
    }
    static int sum(int a,int b,int c){
        return a+b+c;
    }
    static void fun(int a){
        System.out.println("age is " + a);
    }
    static void fun(String name){
        System.out.println(name);
    }

}
