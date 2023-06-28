package leetcode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Description
 * @Author yangfan172
 * @Date 2023/6/28 14:41
 **/
public class L_2496_MaximumValueOfAStringInAnArray {
    public int maximumValue(String[] strs) {
        int max = 0;
        for (int i = 0; i < strs.length; i++) {
            if (isContainsStr(strs[i])) {
                max = Math.max(strs[i].length(), max);
            } else {
                max = Math.max(max, Integer.parseInt(strs[i]));
            }
        }
        return max;
    }

    public boolean isContainsStr(String str) {
        String regex = ".*[a-zA-Z]+.*";
        Matcher m = Pattern.compile(regex).matcher(str);
        return m.matches();
    }
}
