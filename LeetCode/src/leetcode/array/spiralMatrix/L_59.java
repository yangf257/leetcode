package leetcode.array.spiralMatrix;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author yangfan172
 * @Date 2023/6/28 16:42
 **/
public class L_59 {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int i = 0, j = 0;
        boolean[][] isRead = new boolean[n][n];
        int flag = 0;  //0：右；1：下；2：左；3：上

        for (int count = 0; count < n * n; count++) {
            res[i][j] = count + 1;
            isRead[i][j] = true;
            if (flag == 0) {
                if (j + 1 == n || isRead[i][j + 1]) {
                    i++;
                    flag = 1;
                } else {
                    j++;
                }
            } else if (flag == 1) {
                if (i + 1 == n || isRead[i + 1][j]) {
                    j--;
                    flag = 2;
                } else {
                    i++;
                }
            } else if (flag == 2) {
                if (j == 0 || isRead[i][j - 1]) {
                    i--;
                    flag = 3;
                } else {
                    j--;
                }
            } else {
                if (i == 0 || isRead[i - 1][j]) {
                    j++;
                    flag = 0;
                } else {
                    i--;
                }
            }
        }
        return res;
    }
}
