package leetcode.array.binarySearch;

/**
 * @Description
 * @Author yangfan172
 * @Date 2023/6/20 15:13
 **/
public class L_34_Array {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[]{-1, -1};
        }
        return new int[]{findLeft(nums, target), findRight(nums, target)};
    }

    private int findLeft(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int mid = (left + right) / 2;
        boolean isExist = false;
        while (left <= right) {
            if (nums[mid] >= target) {
                right = mid - 1;
                if (nums[mid] == target) {
                    isExist = true;
                }
            } else {
                left = mid + 1;
            }
            mid = (left + right) / 2;
        }
        if (!isExist) {
            return -1;
        }
        return right + 1;
    }

    private int findRight(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int mid = (left + right) / 2;
        boolean isExist = false;
        while (left <= right) {
            if (nums[mid] <= target) {
                left = mid + 1;
                if (nums[mid] == target) {
                    isExist = true;
                }
            } else {
                right = mid - 1;
            }
            mid = (left + right) / 2;
        }
        if (!isExist) {
            return -1;
        }
        return left - 1;
    }
}
