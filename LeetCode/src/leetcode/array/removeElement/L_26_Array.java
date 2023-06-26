package leetcode.array.removeElement;

/**
 * @Description
 * @Author yangfan172
 * @Date 2023/6/21 16:02
 **/
public class L_26_Array {
    public int removeDuplicates(int[] nums) {
        int slow = 0, fast = 0;
        while (fast < nums.length) {
            if (fast + 1 < nums.length && nums[fast] == nums[fast + 1]) {
                ++fast;
            } else {
                nums[slow] = nums[fast];
                ++fast;
                ++slow;
            }
        }
        return slow;
    }
}
