class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        if (n != t.length()) return false;
        char[] sArr = new char[26];
        char[] tArr = new char[26];

        for (int i = 0; i < n; i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            sArr[sChar - 'a']++;
            tArr[tChar - 'a']++;
        }

        if (Arrays.equals(sArr, tArr)) {
            return true;
        } else {
            return false;
        }
    }
}
