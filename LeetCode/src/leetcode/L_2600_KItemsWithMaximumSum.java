package leetcode;

/**
 * @Description
 * @Author yangfan172
 * @Date 2023/7/5 09:50
 **/
public class L_2600_KItemsWithMaximumSum {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if (k <= numOnes + numZeros) {
            return Math.min(k, numOnes);
        } else {
            return numOnes - (k - numOnes - numZeros);
        }
    }
}
