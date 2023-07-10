package leetcode.hashTable;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description
 * @Author yangfan172
 * @Date 2023/7/10 15:26
 **/
public class L_202 {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (true) {
            int sum = 0, temp = n;
            while (temp != 0) {
                sum += temp % 10;
                temp = temp / 10;
            }
            if (sum == 1) {
                return true;
            } else {
                n = calculatePower(n);
                if (set.contains(n)) return false;
                set.add(n);
            }
        }
    }

    private int calculatePower(int n) {
        int sum = 0;
        while (n != 0) {
            int temp = n % 10;
            sum += temp * temp;
            n = n / 10;
        }
        return sum;
    }
}
