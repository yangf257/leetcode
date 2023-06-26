package leetcode.array.removeElement;

/**
 * @Description
 * @Author yangfan172
 * @Date 2023/6/26 10:07
 **/
public class L_977 {
    public int[] sortedSquares(int[] nums) {
        int left = 0, right = nums.length - 1;
        int[] res = new int[nums.length];
        int i = nums.length - 1;
        while (left < right) {
            if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                res[i--] = nums[right] * nums[right];
                right--;
            } else {
                res[i--] = nums[left] * nums[left];
                left++;
            }
        }
        res[0] = nums[left] * nums[left];
        return res;
    }
}
