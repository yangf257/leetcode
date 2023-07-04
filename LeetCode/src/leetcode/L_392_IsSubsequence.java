package leetcode;

import com.sun.xml.internal.ws.util.StringUtils;

/**
 * @Description
 * @Author yangfan172
 * @Date 2023/7/4 19:19
 **/
public class L_392_IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true;
        } else if (t.length() == 0) {
            return false;
        }
        int sPos = 0, tPos = 0;
        while (tPos < t.length()) {
            if (t.charAt(tPos) == s.charAt(sPos)) {
                sPos++;
                if (sPos == s.length()) {
                    return true;
                }
            }
            tPos++;
        }
        return false;
    }
}
