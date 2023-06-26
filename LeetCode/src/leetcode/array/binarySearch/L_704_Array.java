package leetcode.array.binarySearch;

/**
 * @Description 二分查找
 * @Author yangfan172
 * @Date 2023/6/20 14:37
 **/
public class L_704_Array {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int mid = (left + right) / 2;
        while (left <= right) {
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
            mid = (left + right) / 2;
        }
        return -1;
    }
}
