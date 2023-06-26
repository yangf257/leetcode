package leetcode.array.removeElement;

/**
 * @Description
 * @Author yangfan172
 * @Date 2023/6/21 15:43
 **/
public class L_27_Array {
    public int removeElement(int[] nums, int val) {
        int slow = 0, fast = 0;
        int count = 0;
        while (fast < nums.length) {
            if (nums[fast] == val) {
                fast++;
                count++;
            } else {
                nums[slow] = nums[fast];
                fast++;
                slow++;
            }
        }
        return nums.length - count;
    }
}
