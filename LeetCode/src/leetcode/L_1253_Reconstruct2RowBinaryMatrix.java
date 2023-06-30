package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author yangfan172
 * @Date 2023/6/29 10:03
 **/
public class L_1253_Reconstruct2RowBinaryMatrix {
    public List<List<Integer>> reconstructMatrix(int upper, int lower, int[] colsum) {
        List<Integer> row1 = new ArrayList<>();
        List<Integer> row2 = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        res.add(row1);
        res.add(row2);
        int[][] matrix = new int[2][colsum.length];
        for (int i = 0; i < colsum.length; i++) {
            if (colsum[i] == 0) {
                matrix[0][i] = 0;
                matrix[1][i] = 0;
            } else if (colsum[i] == 2) {
                matrix[0][i] = 1;
                matrix[1][i] = 1;
                upper--;
                lower--;
            }
        }
        if (upper < 0 || lower < 0) {
            return new ArrayList<>();
        }

        for (int i = 0; i < colsum.length; i++) {
            if (colsum[i] == 1 && upper > 0) {
                matrix[0][i] = 1;
                upper--;
            } else if (colsum[i] == 1 && upper == 0) {
                matrix[1][i] = 1;
                lower--;
            }
        }
        if (lower != 0) {
            return new ArrayList<>();
        }
        array2List(matrix, res);
        return res;
    }

    private void array2List(int[][] matrix, List<List<Integer>> res) {
        for (int i = 0; i < 2; i++) {
            List<Integer> row = res.get(i);
            for (int j = 0; j < matrix[0].length; j++) {
                row.add(matrix[i][j]);
            }
        }
    }
}
