package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author yangfan172
 * @Date 2023/6/30 15:19
 **/
public class L_2194_CellsInRangeOnExcelSheet {

    private static final char[] chars = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    public List<String> cellsInRange(String s) {
        List<String> res = new ArrayList<>();
        int colOnePos = 0, colTwoPos = 0;
        for (int i = 0; i < chars.length; i++) {
            if (s.charAt(0) == chars[i]) {
                colOnePos = i;
            }
            if (s.charAt(3) == chars[i]) {
                colTwoPos = i;
            }
        }
        for (int i = colOnePos; i <= colTwoPos; i++) {
            for (int j = s.charAt(1) - '0'; j <= s.charAt(4) - '0'; j++) {
                res.add("" + chars[i] + j);
            }
        }

        return res;
    }
}
