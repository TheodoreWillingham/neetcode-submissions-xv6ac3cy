class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        Map<Character, Integer> hashMap = new HashMap<>();

        if (n != t.length()) {
            return false;
        }

        //get frequency of character in string s
        for (int i = 0; i < n; i++) {
            hashMap.put(s.charAt(i), hashMap.getOrDefault(s.charAt(i), 0) + 1);
        }

        //check to see if any different characters
        for (int i = 0; i < n; i++) {
            int count = hashMap.getOrDefault(t.charAt(i), 0);
            hashMap.put(t.charAt(i), count - 1);
            if (count <= 0) {
                return false;
            }
        }

        //see if any strings are left


        return true;


    }
}
