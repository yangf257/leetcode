package leetcode.array.removeElement;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author yangfan172
 * @Date 2023/6/25 15:39
 **/
public class L_844_Array {
    public boolean backspaceCompare(String s, String t) {
        List<Character> sList = new ArrayList<>();
        List<Character> tList = new ArrayList<>();
        String sStringResult = getResultString(s, sList);
        String tStringResult = getResultString(t, tList);

        return sStringResult.equals(tStringResult);
    }

    private String getResultString(String s, List<Character> list) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                if (list.size() != 0) {
                    list.remove(list.size() - 1);
                }
            } else {
                list.add(s.charAt(i));
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
        }
        return sb.toString();
    }
}
