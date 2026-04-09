class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] prefixArr = new int[n];
        int[] postfixArr = new int[n];
        int[] res = new int[n];

        //computer prefix and postfix
        prefixArr[0] = nums[0];
        postfixArr[n - 1] = nums[n - 1];
        for (int i = 1; i < n; i++) {
            prefixArr[i] = prefixArr[i - 1] * nums[i];
            postfixArr[n - 1 - i] = postfixArr[n - i] * nums[n - 1 - i];
        }

        //edge cases
        res[0] = postfixArr[1];
        res[n - 1] = prefixArr[n - 2];

        for (int i = 1; i < n - 1; i++) {
            res[i] = prefixArr[i - 1] * postfixArr[i + 1];
        }

        return res;

    }
}  
