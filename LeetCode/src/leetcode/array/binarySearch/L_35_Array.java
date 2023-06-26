package leetcode.array.binarySearch;

/**
 * @Description 搜索插入位置，二分查找
 * @Author yangfan172
 * @Date 2023/6/20 15:03
 **/
public class L_35_Array {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int mid = (left + right) / 2;
        while (left <= right) {
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
            mid = (left + right) / 2;
        }
        if (mid == 0 && nums[mid] > target) {
            return 0;
        }
        return nums[mid] < target ? mid + 1 : mid - 1;
    }
}
