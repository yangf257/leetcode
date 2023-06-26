package leetcode.array.binarySearch;

/**
 * @Description
 * @Author yangfan172
 * @Date 2023/6/21 15:27
 **/
public class L_367_Array {
    public static boolean isPerfectSquare(int num) {
        int left = 0, right = 50000;
        int mid = (left + right) / 2;
        while (left <= right) {
            if ((long) mid * mid == num) {
                return true;
            } else if ((long) mid * mid > num) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
            mid = (left + right) / 2;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(Math.sqrt(2147395600));
        isPerfectSquare(2147395600);
    }
}
