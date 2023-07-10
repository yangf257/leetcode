package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Author yangfan172
 * @Date 2023/7/10 16:25
 **/
public class L_2768_NumberOfBlackBlocks {
    public long[] countBlackBlocks(int m, int n, int[][] coordinates) {
        int[][] plate = new int[m][n];  //1 for black, 0 for white
        for (int i = 0; i < coordinates.length; i++) {
            plate[coordinates[i][0]][coordinates[i][1]] = 1;
        }

        Map<Integer, Long> map = new HashMap<>();
        map.put(0, 0L);
        map.put(1, 0L);
        map.put(2, 0L);
        map.put(3, 0L);
        map.put(4, 0L);

        for (int i = 0; i < m - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                int count = 0;
                if (plate[i][j] == 1) {
                    count++;
                }
                if (plate[i + 1][j] == 1) {
                    count++;
                }
                if (plate[i][j + 1] == 1) {
                    count++;
                }
                if (plate[i + 1][j + 1] == 1) {
                    count++;
                }
                map.put(count, map.get(count) + 1);
            }
        }

        return new long[]{map.get(0), map.get(1), map.get(2), map.get(3), map.get(4)};
    }
}
