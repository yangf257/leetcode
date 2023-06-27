package leetcode;

import java.util.*;

/**
 * @Description
 * @Author yangfan172
 * @Date 2023/6/27 14:52
 **/
public class L_2215_FindTheDifferenceOfTwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Map<Integer, Boolean> map1 = new HashMap<>();
        Map<Integer, Boolean> map2 = new HashMap<>();
        Map<Integer, Boolean> answer1 = new HashMap<>();
        Map<Integer, Boolean> answer2 = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            map1.put(nums1[i], true);
        }
        for (int i = 0; i < nums2.length; i++) {
            map2.put(nums2[i], true);
            if (!map1.containsKey(nums2[i])) {
                answer2.put(nums2[i], true);
            }
        }
        for (int i = 0; i < nums1.length; i++) {
            if (!map2.containsKey(nums1[i])) {
                answer1.put(nums1[i], true);
            }
        }

        List<Integer> res1 = new ArrayList<>();
        List<Integer> res2 = new ArrayList<>();
        for (int key : answer1.keySet()) {
            res1.add(key);
        }
        for (int key : answer2.keySet()) {
            res2.add(key);
        }
        return Arrays.asList(res1, res2);
    }
}
