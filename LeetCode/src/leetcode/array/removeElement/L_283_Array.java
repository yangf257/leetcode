package leetcode.array.removeElement;

/**
 * @Description
 * @Author yangfan172
 * @Date 2023/6/21 16:09
 **/
public class L_283_Array {
    public void moveZeroes(int[] nums) {
        int slow = 0, fast = 0;
        while (fast < nums.length) {
            if (nums[fast] == 0) {
                fast++;
            } else {
                nums[slow] = nums[fast];
                fast++;
                slow++;
            }
        }
        while (slow < nums.length) {
            nums[slow++] = 0;
        }
    }
}
