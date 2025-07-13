package validAnagram.hashMap.dictionary;

import java.util.HashMap;
import java.util.Map;

public class Solution {
        public boolean isAnagram(String s, String t) {
            if (s.length() != t.length()) return false;
            Map<Character,Integer> frq = new HashMap<>();
            for (char c : s.toCharArray()) {
                if (frq.containsKey(c)){
                    frq.put(c, frq.get(c) + 1);
                }else {
                    frq.put(c, 1);
                }
            }
            for (char c : t.toCharArray()) {
                if (!frq.containsKey(c)) return false;
                frq.put(c, frq.get(c) - 1);
                if (frq.get(c) == 0) {
                    frq.remove(c);
                }
            }

            return frq.size() == 0;
        }

}
