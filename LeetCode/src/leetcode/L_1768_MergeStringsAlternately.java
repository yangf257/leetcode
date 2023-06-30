package leetcode;

/**
 * @Description
 * @Author yangfan172
 * @Date 2023/6/30 11:08
 **/
public class L_1768_MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int p1 = 0, p2 = 0;
        while (p1 < word1.length() && p2 < word2.length()) {
            sb.append(word1.charAt(p1++));
            sb.append(word2.charAt(p2++));
        }

        if (p1 < word1.length()) {
            sb.append(word1.substring(p1));
        }
        if (p2 < word2.length()) {
            sb.append(word2.substring(p2));
        }
        return sb.toString();
    }
}
