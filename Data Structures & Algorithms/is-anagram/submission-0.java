class Solution {
    public boolean isAnagram(String s, String t) {
 int strLength1 = s.length();
        int strLenght2 = t.length();
        if (strLength1 != strLenght2) {
            return false;
        }
        int[] count = new int[26];
        for (int i = 0; i < strLength1; i++) {
            count[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < strLenght2; i++) {
            count[t.charAt(i) - 'a']--;
        }
        for (int i : count) {
            if (i != 0) {
                return false;
            }
        }
        return true;    
    }
}
