class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int res = 0;
        // go through each value in nums
        for (int i = 0; i < nums.size(); i++) {
            res ^= nums[i];
            res ^= i;
        }
        res ^= nums.size();

        return res;
    }
};
