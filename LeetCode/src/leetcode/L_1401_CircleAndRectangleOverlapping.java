package leetcode;

/**
 * @Description
 * @Author yangfan172
 * @Date 2023/6/25 11:04
 **/
public class L_1401_CircleAndRectangleOverlapping {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        double dist = 0;
        if (xCenter < x1 || xCenter > x2) {
            dist += Math.min(Math.pow(x1 - xCenter, 2), Math.pow(x2 - xCenter, 2));
        }
        if (yCenter < y1 || yCenter > y2) {
            dist += Math.min(Math.pow(y1 - yCenter, 2), Math.pow(y2 - yCenter, 2));
        }
        return dist <= radius * radius;
    }
}
