package leetcode.hashTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description
 * @Author yangfan172
 * @Date 2023/7/10 14:41
 **/
public class L_438 {
    public List<Integer> findAnagrams(String s, String p) {
        char[] key = p.toCharArray();
        Arrays.sort(key);
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i <= s.length() - p.length(); i++) {
            if (isAnagrams(s.substring(i, i + p.length()), key)) {
                res.add(i);
            }
        }
        return res;
    }

    public boolean isAnagrams(String s1, char[] s2) {
        if (s1.length() != s2.length) {
            return false;
        }
        char[] chars1 = s1.toCharArray();
        Arrays.sort(chars1);
        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] != s2[i]) {
                return false;
            }
        }
        return true;
    }
}
