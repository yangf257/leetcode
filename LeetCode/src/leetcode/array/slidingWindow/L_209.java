package leetcode.array.slidingWindow;

/**
 * @Description
 * @Author yangfan172
 * @Date 2023/6/26 10:17
 **/
public class L_209 {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0, right = 0;
        int sum = 0;
        int res = Integer.MAX_VALUE;
        while (right < nums.length) {
            sum += nums[right];
            right++;
            while (sum >= target) {
                sum -= nums[left];
                res = Math.min(res, right - left);
                left++;
            }
        }
        if (res == Integer.MAX_VALUE) {
            res = 0;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 1, 1, 1, 1};
        new L_209().minSubArrayLen(11, nums);
    }
}
