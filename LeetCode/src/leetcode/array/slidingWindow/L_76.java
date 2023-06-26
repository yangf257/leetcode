package leetcode.array.slidingWindow;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Author yangfan172
 * @Date 2023/6/26 11:19
 **/
public class L_76 {
    public String minWindow(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1);
        }

        int left = 0, right = 0;
        int minLength = Integer.MAX_VALUE;
        int count = map.size();
        String res = "";
        while (right < s.length()) {
            if (map.containsKey(s.charAt(right))) {
                map.put(s.charAt(right), map.get(s.charAt(right)) - 1);
                if (map.get(s.charAt(right)) == 0) {
                    count--;
                }
            }
            while (count == 0) {
                if (map.containsKey(s.charAt(left))) {
                    map.put(s.charAt(left), map.get(s.charAt(left)) + 1);
                    if (map.get(s.charAt(left)) > 0) {
                        count++;
                    }
                    if (right - left < minLength) {
                        minLength = right - left;
                        res = s.substring(left, right + 1);
                    }
                }
                left++;
            }
            right++;
        }
        return res;
    }

    public static void main(String[] args) {
        new L_76().minWindow("ADOBECODEBANC", "ABC");
    }
}
