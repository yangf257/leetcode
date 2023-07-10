package leetcode.hashTable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Description
 * @Author yangfan172
 * @Date 2023/7/10 14:53
 **/
public class L_349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        Set<Integer> sameList = new HashSet<>();
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                sameList.add(nums2[i]);
            }
        }
        int[] res = new int[sameList.size()];
        int i = 0;
        for (int sameNum : sameList) {
            res[i++] = sameNum;
        }
        return res;
    }
}
