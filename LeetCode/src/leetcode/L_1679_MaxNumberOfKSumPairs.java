package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Author yangfan172
 * @Date 2023/7/4 19:30
 **/
public class L_1679_MaxNumberOfKSumPairs {
    public int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int res = 0;
        for (int num : map.keySet()) {
            if (map.get(k - num) != null) {
                if (num == k - num) {
                    while (map.get(num) >= 2) {
                        map.put(num, map.get(num) - 2);
                        res++;
                    }
                } else {
                    while (map.get(num) != 0 && map.get(k - num) != 0) {
                        map.put(num, map.get(num) - 1);
                        map.put(k - num, map.get(k - num) - 1);
                        res++;
                    }
                }
            }
        }
        return res;
    }
}
