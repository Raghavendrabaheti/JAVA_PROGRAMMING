package DSA.LinearSearch;

public class Leet1672 {
    public static void main(String[] args) {
    int [][] accounts = {
            {21,2},
            {2,2},
            {22,11}
        };
        System.out.println(maximumWealth(accounts));
    }
    static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;

        for (int[] ints : accounts) {
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            if (sum > ans) ans = sum;
        }
        return ans;
    }
}
