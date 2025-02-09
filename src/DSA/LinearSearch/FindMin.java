package DSA.LinearSearch;

public class FindMin {
    public static void main(String[] args) {
        int [] arr = {12,323,3,43,23,31};
        System.out.println(min(arr));
    }

     static int min(int[] arr) {
        int ans = arr[0];
        for (int i =1;i < arr.length; i++){
            if (arr[i]<ans){
                ans= arr[i];
            }
        }
        return ans;
    }
}
