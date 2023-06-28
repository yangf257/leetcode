package offer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author yangfan172
 * @Date 2023/6/28 16:50
 **/
public class Offer_29 {
    public int[] spiralOrder(int[][] matrix) {
        List<Integer> integers = new ArrayList<>();
        if (matrix.length == 0) {
            return new int[]{};
        }
        int m = matrix.length, n = matrix[0].length;
        int i = 0, j = 0;
        boolean[][] isRead = new boolean[m][n];
        int flag = 0;  //0：右；1：下；2：左；3：上

        for (int count = 0; count < m * n; count++) {
            if (flag == 0) {
                integers.add(matrix[i][j]);
                isRead[i][j] = true;
                if (j + 1 == n || isRead[i][j + 1]) {
                    i++;
                    flag = 1;
                } else {
                    j++;
                }
            } else if (flag == 1) {
                integers.add(matrix[i][j]);
                isRead[i][j] = true;
                if (i + 1 == m || isRead[i + 1][j]) {
                    j--;
                    flag = 2;
                } else {
                    i++;
                }
            } else if (flag == 2) {
                integers.add(matrix[i][j]);
                isRead[i][j] = true;
                if (j == 0 || isRead[i][j - 1]) {
                    i--;
                    flag = 3;
                } else {
                    j--;
                }
            } else {
                integers.add(matrix[i][j]);
                isRead[i][j] = true;
                if (i == 0 || isRead[i - 1][j]) {
                    j++;
                    flag = 0;
                } else {
                    i--;
                }
            }
        }
        int[] res = new int[m * n];
        for (int k = 0; k < integers.size(); k++) {
            res[k] = integers.get(k);
        }
        return res;
    }
}
