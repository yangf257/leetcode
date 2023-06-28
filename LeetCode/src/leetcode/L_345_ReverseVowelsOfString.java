package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description
 * @Author yangfan172
 * @Date 2023/6/28 15:52
 **/
public class L_345_ReverseVowelsOfString {
    public String reverseVowels(String s) {
        List<Character> vowels = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s, i)) {
                vowels.add(s.charAt(i));
            }
        }
        char[] vowelsChar = new char[vowels.size()];
        for (int i = 0; i < vowels.size(); i++) {
            vowelsChar[i] = vowels.get(i);
        }
        int left = 0, right = vowelsChar.length - 1;
        while (left < right) {
            Character c = vowelsChar[left];
            vowelsChar[left] = vowelsChar[right];
            vowelsChar[right] = c;
            left++;
            right--;
        }
        StringBuilder sb = new StringBuilder(s);
        int count = 0;
        for (int i = 0; i < sb.length(); i++) {
            if (isVowel(s, i)) {
                sb.replace(i, i + 1, "" + vowelsChar[count++]);
            }
        }
        return sb.toString();
    }

    private boolean isVowel(String s, int index) {
        if (s.charAt(index) == 'a'
                || s.charAt(index) == 'e'
                || s.charAt(index) == 'i'
                || s.charAt(index) == 'o'
                || s.charAt(index) == 'u'
                || s.charAt(index) == 'A'
                || s.charAt(index) == 'E'
                || s.charAt(index) == 'I'
                || s.charAt(index) == 'O'
                || s.charAt(index) == 'U') {
            return true;
        }
        return false;
    }
}
