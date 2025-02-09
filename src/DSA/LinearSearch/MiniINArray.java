package DSA.LinearSearch;

public class MiniINArray {
    public static void main(String[] args) {
        int [] arr = {12,31,21,3,43,21};
        System.out.println(mini(arr));
    }
    static int mini(int[] arr){
        int ans = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < ans) ans =arr[i];

        }
        return ans;
    }
}
