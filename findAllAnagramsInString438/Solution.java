package findAllAnagramsInString438;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

class Solution {
    public static List<Integer> findAnagrams(String s, String p) {
        Map<Character,Integer> pMap = new HashMap<>();
        Map<Character,Integer> sMap = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        if (s.length() < p.length()) return ans;
        
        for (int i = 0; i < p.length(); i++) {
            char c = p.charAt(i);
            pMap.put(c, pMap.getOrDefault(c, 0) + 1);
        }

        int start = 0;
        for(int end = 0; end < s.length(); end++) {
            char current =s.charAt(end);
            sMap.put(current,sMap.getOrDefault(current, 0) + 1);
            if (end - start + 1 == p.length()){
                if (sMap.equals(pMap)){
                    ans.add(start);
                }

                char leftChar = s.charAt(start);
                sMap.put(leftChar, sMap.get(leftChar)-1);
                if(sMap.get(leftChar) == 0){
                    sMap.remove(leftChar);
                }

                start++;
            }

        }
        
        return ans;

    }

    public static void main (String[] args) {
        String  s = "cbaebabacd";
        String  p = "abc";
        List<Integer> ans = findAnagrams(s, p);
        System.out.println(ans);
    }
}