package leetcode;

/**
 * @Description
 * @Author yangfan172
 * @Date 2023/7/10 16:45
 **/
public class L_2729_IsCharming {
    public boolean isFascinating(int n) {
        if (n * 3 > 999) {
            return false;
        }
        int num1 = n * 2, num2 = n * 3;
        int[] flag = new int[10];
        while (n != 0) {
            flag[n % 10]++;
            n /= 10;
            flag[num1 % 10]++;
            num1 /= 10;
            flag[num2 % 10]++;
            num2 /= 10;
        }
        for (int i = 0; i < flag.length; i++) {
            if (flag[0] != 0) {
                return false;
            }
            if (i > 0 && flag[i] != 1) {
                return false;
            }
        }

        return true;
    }
}
