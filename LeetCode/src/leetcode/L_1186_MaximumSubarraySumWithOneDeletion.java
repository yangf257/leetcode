package leetcode;

/**
 * @Description
 * @Author yangfan172
 * @Date 2023/6/27 10:24
 **/
public class L_1186_MaximumSubarraySumWithOneDeletion {
    public int maximumSum(int[] arr) {
        int[][] dp = new int[arr.length][2];

        dp[0][0] = arr[0];
        dp[0][1] = 0;
        int res = arr[0];

        for (int i = 1; i < arr.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0] + arr[i], arr[i]);
            dp[i][1] = Math.max(dp[i - 1][0], dp[i - 1][1] + arr[i]);
            res = Math.max(dp[i][0], Math.max(dp[i][1], res));
        }
        return res;
    }


    public static void main(String[] args) {
        new L_1186_MaximumSubarraySumWithOneDeletion().maximumSum(new int[]{2, 1, -2, -5, -2});
    }
}
