package leetcode;

/**
 * @Description
 * @Author yangfan172
 * @Date 2023/6/30 11:18
 **/
public class L_605_CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (flowerbed.length == 1) {
            if (flowerbed[0] == 0 && n <= 1 || flowerbed[0] == 1 && n == 0) {
                return true;
            }
            return false;
        }
        for (int i = 0; i < flowerbed.length; i++) {
            if (n == 0) {
                return true;
            }

            if (i == 0) {
                if (flowerbed[i] == 0 && flowerbed[i + 1] == 0 && n > 0) {
                    flowerbed[i] = 1;
                    n--;
                }
            } else if (i == flowerbed.length - 1) {
                if (flowerbed[i] == 0 && flowerbed[i - 1] == 0 && n > 0) {
                    flowerbed[i] = 1;
                    n--;
                }
            } else {
                if (flowerbed[i] == 0 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0 && n > 0) {
                    flowerbed[i] = 1;
                    n--;
                }
            }
        }

        return n == 0;
    }
}
