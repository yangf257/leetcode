package leetcode.array.binarySearch;

/**
 * @Description
 * @Author yangfan172
 * @Date 2023/6/20 15:50
 **/
public class L_69_Array {
    public int mySqrt(int x) {
        int l = 0, r = x, ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if ((long) mid * mid <= x) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }
}
