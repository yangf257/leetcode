package leetcode.array.spiralMatrix;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author yangfan172
 * @Date 2023/6/28 16:25
 **/
public class L_54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int m = matrix.length, n = matrix[0].length;
        int i = 0, j = 0;
        boolean[][] isRead = new boolean[m][n];
        int flag = 0;  //0：右；1：下；2：左；3：上

        for (int count = 0; count < m * n; count++) {
            if (flag == 0) {
                res.add(matrix[i][j]);
                isRead[i][j] = true;
                if (j + 1 == n || isRead[i][j + 1]) {
                    i++;
                    flag = 1;
                } else {
                    j++;
                }
            } else if (flag == 1) {
                res.add(matrix[i][j]);
                isRead[i][j] = true;
                if (i + 1 == m || isRead[i + 1][j]) {
                    j--;
                    flag = 2;
                } else {
                    i++;
                }
            } else if (flag == 2) {
                res.add(matrix[i][j]);
                isRead[i][j] = true;
                if (j == 0 || isRead[i][j - 1]) {
                    i--;
                    flag = 3;
                } else {
                    j--;
                }
            } else {
                res.add(matrix[i][j]);
                isRead[i][j] = true;
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
