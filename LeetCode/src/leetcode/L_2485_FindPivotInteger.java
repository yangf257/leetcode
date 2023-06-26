package leetcode;

/**
 * @Description
 * @Author yangfan172
 * @Date 2023/6/26 10:34
 **/
public class L_2485_FindPivotInteger {
    public int pivotInteger(int n) {
        for (int i = n / 2; i <= n; i++) {
            if (getSum(1, i) == getSum(i, n)) {
                return i;
            }
        }
        return -1;
    }

    private int getSum(int left, int right) {
        return (right - left + 1) * (left + right) / 2;
    }
}
