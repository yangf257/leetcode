package leetcode.hashTable;

import java.util.*;

/**
 * @Description
 * @Author yangfan172
 * @Date 2023/7/7 16:05
 **/
public class L_49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for (String str : strs) {
            //将每一个字符串排序后的新串作为键值key，key相同则为字母异位词
            char[] array = str.toCharArray();
            Arrays.sort(array);
            String key = new String(array);

            //看该key是否在map中存在，若不存在则新建一个list；存在则返回
            List<String> list = map.getOrDefault(key, new ArrayList<String>());

            //将key所对应的原字符串添加到list当中
            list.add(str);
            map.put(key, list);
        }
        return new ArrayList<List<String>>(map.values());
    }
}
