package leetcode;

/**
 * @Description
 * @Author yangfan172
 * @Date 2023/6/27 14:40
 **/
public class L_724_FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int leftSum = 0, rightSum = 0;
        for (int i = 1; i < nums.length; i++) {
            rightSum += nums[i];
        }

        for (int pivot = 0; pivot < nums.length; pivot++) {
            if (leftSum == rightSum) {
                return pivot;
            }
            leftSum += nums[pivot];
            rightSum -= nums[pivot + 1];
        }
        if (leftSum == 0) {
            return nums.length - 1;
        }
        return -1;
    }
}
