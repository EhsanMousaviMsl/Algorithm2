package validAnagram.hashMap.array;

class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr = new int[26];
        for(char c : s.toCharArray()) {
            arr[c - 'a'] += 1;
        }
        for (char c : t.toCharArray()) {
            arr[c - 'a'] -= 1;
        }

        for (int count : arr){
            if (count != 0) return false;
        }

        return true;
    }
}
