class Solution {
    public int characterReplacement(String s, int k) {
        int res = 0;
        //counts all 26 uppercase letters
        int[] freqCount = new int[26];
        //maxF - stores the max frequency
        int maxF = 0; 
        //left and right pointer (sliding window)
        int left = 0, right = 0, n = s.length();

        while (right < n) {
            //go right and calculate new freq
            if (++freqCount[s.charAt(right) - 'A'] > maxF) maxF++;

            while (((right - left + 1) - maxF) > k) {
                freqCount[s.charAt(left) - 'A']--;
                left++;
            }

            res = Math.max(res, (right - left + 1));

            right++;

            // if ((right - left + 1) - maxF <= k) { //if valid (windowLength - maxF <= limit)
            //     //add to freqCount + update maxF if necessary

            //     res = Math.max(res, (right - left + 1));
            //     right++;
            // } else { //if not valid shrink window until it is valid
            //     freqCount[s.charAt(left) - 'A']--;
            //     left++;
            // }
        }

        return res;

    }
}
