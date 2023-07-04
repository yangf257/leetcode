package leetcode.hashTable;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Author yangfan172
 * @Date 2023/7/4 15:45
 **/
public class L_383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> ransomNoteMap = new HashMap<>(), magazineMap = new HashMap<>();
        for (int i = 0; i < ransomNote.length(); i++) {
            ransomNoteMap.put(ransomNote.charAt(i), ransomNoteMap.getOrDefault(ransomNote.charAt(i), 0) + 1);
        }
        for (int i = 0; i < magazine.length(); i++) {
            magazineMap.put(magazine.charAt(i), magazineMap.getOrDefault(magazine.charAt(i), 0) + 1);
        }

        for (char c : ransomNoteMap.keySet()) {
            if (magazineMap.get(c) == null || magazineMap.get(c) < ransomNoteMap.get(c)) {
                return false;
            }
        }
        return true;
    }
}
