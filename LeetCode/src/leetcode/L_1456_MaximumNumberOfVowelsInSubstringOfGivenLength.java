package leetcode;

/**
 * @Description
 * @Author yangfan172
 * @Date 2023/7/12 11:15
 **/
public class L_1456_MaximumNumberOfVowelsInSubstringOfGivenLength {
    public int maxVowels(String s, int k) {
        int left = 0, right = k - 1;
        int max = 0;
        for (int i = 0; i <= right; i++) {
            if (isVowel(s.charAt(i))) {
                max++;
            }
        }

        right++;
        int count = max;
        while (right < s.length()) {
            if (isVowel(s.charAt(left))) {
                count--;
            }
            if (isVowel(s.charAt(right))) {
                count++;
            }
            right++;
            left++;
            max = Math.max(count, max);
        }
        return max;
    }

    private boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        }
        return false;
    }
}
