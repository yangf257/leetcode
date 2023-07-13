package leetcode;

import java.util.Stack;

/**
 * @Description
 * @Author yangfan172
 * @Date 2023/7/12 14:08
 **/
public class L_2390_RemovingStarsFromString {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '*') {
                stack.push(s.charAt(i));
            } else {
                stack.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
