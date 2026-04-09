class Solution {
public:
    vector<int> countBits(int n) {
        vector<int> dp(n + 1);
        int category = 1;

        for (int i = 1; i <= n; i++) {
            if (i == (category << 1)) category <<= 1;

            dp[i] = 1 + dp[i - category];
        }

        return dp;
    }
};
