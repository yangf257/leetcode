package leetcode.hashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description
 * @Author yangfan172
 * @Date 2023/7/10 15:09
 **/
public class L_350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map1 = new HashMap<>(), map2 = new HashMap<>();
        for (int num : nums1) {
            map1.put(num, map1.getOrDefault(num, 0) + 1);
        }
        for (int num : nums2) {
            map2.put(num, map2.getOrDefault(num, 0) + 1);
        }

        List<Integer> resList = new ArrayList<>();
        for (int key : map1.keySet()) {
            if (map2.containsKey(key)) {
                int count = map1.get(key) < map2.get(key) ? map1.get(key) : map2.get(key);
                while (count > 0) {
                    resList.add(key);
                    count--;
                }
            }
        }
        int[] res = new int[resList.size()];
        for (int i = 0; i < resList.size(); i++) {
            res[i] = resList.get(i);
        }
        return res;
    }
}
