package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Author yangfan172
 * @Date 2023/6/27 15:06
 **/
public class L_1207_UniqueNumberOfOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> timesOfNum = new HashMap<>();
        Map<Integer, Integer> timesOfTimes = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            timesOfNum.put(arr[i], timesOfNum.getOrDefault(arr[i], 0) + 1);
        }
        for (int key : timesOfNum.keySet()) {
            timesOfTimes.put(timesOfNum.get(key), timesOfTimes.getOrDefault(timesOfNum.get(key), 0) + 1);
        }
        for (int key : timesOfTimes.keySet()) {
            if (timesOfTimes.get(key) != 1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        new L_1207_UniqueNumberOfOccurrences().uniqueOccurrences(new int[]{1, 2});
    }
}
