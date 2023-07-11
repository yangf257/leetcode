package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author yangfan172
 * @Date 2023/7/11 10:25
 **/
public class L_1431_KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int num : candies) {
            max = Math.max(num, max);
        }

        List<Boolean> res = new ArrayList<>();
        for (int candy : candies) {
            if (candy + extraCandies >= max) {
                res.add(true);
            } else {
                res.add(false);
            }
        }
        return res;
    }
}
