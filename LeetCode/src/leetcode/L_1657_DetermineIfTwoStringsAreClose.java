package leetcode;

import java.util.*;

/**
 * @Description
 * @Author yangfan172
 * @Date 2023/7/11 10:33
 **/
public class L_1657_DetermineIfTwoStringsAreClose {
    public boolean closeStrings1(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        Set<Character> set1 = new HashSet<>(), set2 = new HashSet<>();
        for (int i = 0; i < word1.length(); i++) {
            set1.add(word1.charAt(i));
            set2.add(word2.charAt(i));
        }
        if (set1.size() != set2.size()) {
            return false;
        }
        for (char c : set1) {
            if (!set2.contains(c)) {
                return false;
            }
        }
        return true;
    }

    /**
     * 证明如下三个条件即可：
     * <p>1.长度相同</p>
     * <p>2.字母种类相同</p>
     * <p>3.“结构”相同：指word1的字母和word2的字母个数存在双射关系。注意这里只强调个数，不强调是哪个字母。举例说明：</p>
     * <p>“结构”相同：word1有3个‘a’，2个‘b’，1个‘c’； word2有3个‘b’，2个‘a’，1个‘c’；</p>
     * <p>“结构”相同：word1有1个‘a’，2个‘b’，1个‘c’； word2有1个‘c’，2个‘a’，1个‘b’；</p>
     * <p>“结构”不相同：word1有3个‘a’，2个‘b’，1个‘c’； word2有3个‘a’，2个‘b’，2个‘c’；</p>
     * <p>“结构”不相同：word1有1个‘a’，2个‘b’，1个‘c’； word2有1个‘a’，3个‘b’。</p>
     * <p>证明：条件1+2+3是“接近”的充分必要条件</p>
     * 充分条件：对于已经满足条件的word1和word2，一定存在调整方法。方法如下：首先只利用操作1将word2调整成和word1同样的“结构”顺序。由于二者“结构”相同，这一定可以做到。其次只利用操作2将word2调整成word1.由于二者字母种类相同，这一定可以做到。
     * <p>
     * 必要条件：由于操作1和操作2不会改变字母种类和“结构”，则word2接近word1则自动满足条件。
     */
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        Map<Character, Integer> map1 = new HashMap(), map2 = new HashMap<>();
        for (int i = 0; i < word1.length(); i++) {
            map1.put(word1.charAt(i), map1.getOrDefault(word1.charAt(i), 0) + 1);
            map2.put(word2.charAt(i), map2.getOrDefault(word2.charAt(i), 0) + 1);
        }
        if (map1.size() != map2.size()) {
            return false;
        }
        for (char c : map1.keySet()) {
            if (!map2.containsKey(c)) {
                return false;
            }
        }
        List<String> list1 = new ArrayList<>(), list2 = new ArrayList<>();
        for (char c : map1.keySet()) {
            list1.add(map1.get(c) + "");
            list2.add(map2.get(c) + "");
        }
        if (list1.size() != list2.size()) {
            return false;
        }
        Collections.sort(list1);
        Collections.sort(list2);
        for (int i = 0; i < list1.size(); i++) {
            if (!list1.get(i).equals(list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        new L_1657_DetermineIfTwoStringsAreClose().closeStrings("aaabbbbccddeeeeefffff", "aaaaabbcccdddeeeeffff");
    }
}
