package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author yangfan172
 * @Date 2023/6/28 15:07
 **/
public class L_443_StringCompression {
    public int compress(char[] chars) {
        int left = 0, right = 0;
        int count = 0;
        int tempPos = 0;
        while (right < chars.length) {
            if (chars[right] == chars[tempPos]) {
                right++;
                count++;
            } else {
                tempPos = right;
                if (count == 1) {
                    chars[left++] = chars[right - 1];
                    count = 0;
                } else if (count >= 2 && count <= 9) {
                    chars[left++] = chars[right - 1];
                    chars[left++] = (char) ('0' + count);
                    count = 0;
                } else {
                    chars[left++] = chars[right - 1];
                    for (Integer integer : getCountEveryBit(count)) {
                        chars[left++] = (char) ('0' + integer);
                    }
                    count = 0;
                }
            }
        }

        if (count == 1) {
            chars[left++] = chars[right - 1];
            count = 0;
        } else if (count >= 2 && count <= 9) {
            chars[left++] = chars[right - 1];
            chars[left++] = (char) ('0' + count);
            count = 0;
        } else {
            chars[left++] = chars[right - 1];
            for (Integer integer : getCountEveryBit(count)) {
                chars[left++] = (char) ('0' + integer);
            }
            count = 0;
        }
        return left;
    }

    private List<Integer> getCountEveryBit(int count) {
        List<Integer> bits = new ArrayList<>();
        while (count > 0) {
            bits.add(0, count % 10);
            count /= 10;
        }
        return bits;
    }

    public static void main(String[] args) {
        new L_443_StringCompression().compress(new char[]{'a', 'a', 'a', 'b', 'b', 'a', 'a'});
    }
}
