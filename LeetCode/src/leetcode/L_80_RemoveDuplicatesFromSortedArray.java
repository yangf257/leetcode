package leetcode;

/**
 * @Description
 * @Author yangfan172
 * @Date 2023/6/26 16:00
 **/
public class L_80_RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n <= 2) {
            return n;
        }
        int slow = 2, fast = 2;
        while (fast < n) {
            if (nums[slow - 2] != nums[fast]) {
                nums[slow] = nums[fast];
                ++slow;
            }
            ++fast;
        }
        return slow;
    }

    public static void main(String[] args) {
        new L_80_RemoveDuplicatesFromSortedArray().removeDuplicates(new int[]{1, 1, 1, 2, 2, 3});
    }
}
