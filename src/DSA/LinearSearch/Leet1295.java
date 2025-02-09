package DSA.LinearSearch;

public class Leet1295 {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findnumbers(nums));
    }
    static int findnumbers(int[] nums){
        int count = 0;
        for(int num: nums) {
         if(even(num)){
             count++;
         }
        }
        return count;
    }

     static boolean even(int num) {
        int numberOFDigits = digits(num);
        return numberOFDigits % 2 ==0;
    }


    static int digits(int num){
        if(num<0){
            num=num * -1;
        }
        return (int)(Math.log10(num)+1);
//    static int digits(int num) {
//      int count =0;
//      while(num>0)
//      {
//          count++;
//          num/=10;
//      }
//      return count;

    }
}
