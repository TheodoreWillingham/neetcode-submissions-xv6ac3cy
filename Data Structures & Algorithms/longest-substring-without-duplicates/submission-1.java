class Solution {
    public int lengthOfLongestSubstring(String s) {
        //set to keep track of all characters in window
        Set<Character> windowSet = new HashSet<>();
        //int to keep track of longest subString
        int maxLength = 0;
        //points to start of window
        int pointer = 0;


        //go through each char in the string s
        for (int i = 0; i < s.length(); i++) {
            //new char we are adding to window
            char c = s.charAt(i);

            if (windowSet.contains(c)) {
                //go until we reach duplicate char and remove
                while (s.charAt(pointer) != c) {
                    windowSet.remove(s.charAt(pointer));
                    pointer++;
                }
                pointer++;
            } else {
                windowSet.add(c);
            }

            //update max
            maxLength = Math.max(windowSet.size(), maxLength);
        }

        return maxLength;
    }
}
