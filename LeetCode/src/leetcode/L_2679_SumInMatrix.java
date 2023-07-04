package leetcode;

import java.util.Arrays;
import java.util.Collections;

/**
 * @Description
 * @Author yangfan172
 * @Date 2023/7/4 14:35
 **/
public class L_2679_SumInMatrix {
    public int matrixSum(int[][] nums) {
        for (int i = 0; i < nums.length; i++) {
            Arrays.sort(nums[i]);
        }
        int result = 0;
        int[] temp = new int[nums.length];
        for (int col = nums[0].length - 1; col >= 0; col--) {
            for (int row = 0; row < nums.length; row++) {
                temp[row] = nums[row][col];
            }
            Arrays.sort(temp);
            result += temp[temp.length - 1];
        }
        return result;
    }
}
