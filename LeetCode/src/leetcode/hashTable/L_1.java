package leetcode.hashTable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Description
 * @Author yangfan172
 * @Date 2023/7/10 15:38
 **/
public class L_1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> nums2Index = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            nums2Index.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums2Index.containsKey(target - nums[i]) && i != nums2Index.get(target - nums[i])) {
                return new int[]{i, nums2Index.get(target - nums[i])};
            }
        }
        return null;
    }
}
