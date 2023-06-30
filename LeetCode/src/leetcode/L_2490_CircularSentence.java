package leetcode;

/**
 * @Description
 * @Author yangfan172
 * @Date 2023/6/30 10:16
 **/
public class L_2490_CircularSentence {
    public boolean isCircularSentence(String sentence) {
        String[] s = sentence.split(" ");
        for (int i = 0; i < s.length; i++) {
            if (i == s.length - 1) {
                if (s[i].charAt(s[i].length() - 1) != s[0].charAt(0)) {
                    return false;
                }
            } else {
                if (s[i].charAt(s[i].length() - 1) != s[i + 1].charAt(0)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String sentence = "leetcode exercises sound delightful";
        new L_2490_CircularSentence().isCircularSentence(sentence);
    }
}
