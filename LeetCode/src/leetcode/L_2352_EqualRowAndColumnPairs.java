package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @Description
 * @Author yangfan172
 * @Date 2023/7/11 11:04
 **/
public class L_2352_EqualRowAndColumnPairs {
    public int equalPairs(int[][] grid) {
        Map<String, Integer> mapColumn = new HashMap<>(), mapRow = new HashMap<>();
        for (int i = 0; i < grid.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < grid.length; j++) {
                sb.append(grid[i][j]).append(",");
            }
            mapRow.put(sb.toString(), mapRow.getOrDefault(sb.toString(), 0) + 1);
        }

        for (int j = 0; j < grid.length; j++) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < grid.length; i++) {
                sb.append(grid[i][j]).append(",");
            }
            mapColumn.put(sb.toString(), mapColumn.getOrDefault(sb.toString(), 0) + 1);
        }
        int res = 0;
        for (String s : mapRow.keySet()) {
            if (mapColumn.containsKey(s)) {
                res += mapRow.get(s) * mapColumn.get(s);
            }
        }

        return res;
    }
}
