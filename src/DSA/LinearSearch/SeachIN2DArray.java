package DSA.LinearSearch;

import java.util.Arrays;

public class SeachIN2DArray {
    public static void main(String[] args) {
        int [] [] arr = {
                {42,21,43,43,41,56,77},
                {13,43,56,44,63,21,43,22},
                {32,43,52,31,123,53,354,21,12},
                {232,23,32,372,313,2,442,12,2}
        };
        int target = 32;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));

        System.out.println(max(arr));
    }
    static int[] search (int [][] arr, int target){
        for (int row = 0; row < arr.length; row++){
            for (int col = 0 ;col < arr[row].length; col++){
                if(arr[row][col]==target) {
                    return new int[]{row, col};
                }
        }

        }
        return new int[]{-1,-1};

    }

    static int max (int [][] arr){
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max)
                    max = element;
            }

        }
        return max;

    }
}


