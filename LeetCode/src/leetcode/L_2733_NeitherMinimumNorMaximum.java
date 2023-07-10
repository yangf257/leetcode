package leetcode;

import java.util.Arrays;

/**
 * @Description
 * @Author yangfan172
 * @Date 2023/7/10 16:41
 **/
public class L_2733_NeitherMinimumNorMaximum {
    public int findNonMinOrMax(int[] nums) {
        if (nums.length <= 2) {
            return -1;
        }
        Arrays.sort(nums);
        return nums[1];
    }
}
