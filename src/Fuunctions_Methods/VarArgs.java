package Fuunctions_Methods;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//    demo(2,3,34,4,3);
        demo("Raghav","raj","ram");
    }
    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
}
