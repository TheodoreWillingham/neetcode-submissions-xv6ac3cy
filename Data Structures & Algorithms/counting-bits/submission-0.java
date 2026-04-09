class Solution {
    public int[] countBits(int n) {
        //currently all ones we will store values here
        int[] dp = new int[n + 1];

        //1, 2, 4, 8
        int category = 1;

        for (int i = 1; i < n + 1; i++) {
            if (i == category * 2) { 
                category  <<= 1;
            }
            dp[i] = 1 + dp[i - category];
        }

        return dp;
    }
}
