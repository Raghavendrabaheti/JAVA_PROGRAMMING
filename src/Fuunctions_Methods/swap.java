package Fuunctions_Methods;

public class swap {
    public static void main(String[] args) {
        int[] nums = {2, 3};
        swap(nums);
        System.out.println("a: " + nums[0] + ", b: " + nums[1]);
    }

    static void swap(int[] nums) {
        nums[0] = nums[0] ^ nums[1];
        nums[1] = nums[0] ^ nums[1];
        nums[0] = nums[0] ^ nums[1];
    }
}
//public class swap {
//    public static void main(String[] args) {
//        int a = 2, b = 3;
////        a = a ^ b;  // Step 1
////        b = a ^ b;  // Step 2
////        a = a ^ b;  // Step 3
////        System.out.println("a: " + a);
////        System.out.println("b: " + b);
//        swap(a,b);
//        System.out.println(a +" " + b);
//    }
//        static void swap(int a, int b){
//        a = a ^ b;  // Step 1
//        b = a ^ b;  // Step 2
//        a = a ^ b;  // Step 3
//        }}
