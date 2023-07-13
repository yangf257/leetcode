package leetcode;

/**
 * @Description
 * @Author yangfan172
 * @Date 2023/7/12 10:05
 **/
public class L_2544_AlternatingDigitSum {
    public int alternateDigitSum(int n) {
        String s = Integer.toString(n);
        int sum = 0;
        boolean isAdd = true;
        for (int i = 0; i < s.length(); i++) {
            if (isAdd) {
                sum += Integer.valueOf(s.substring(i, i + 1));
                isAdd = false;
            } else {
                sum -= Integer.valueOf(s.substring(i, i + 1));
                isAdd = true;
            }
        }
        return sum;
    }
}
