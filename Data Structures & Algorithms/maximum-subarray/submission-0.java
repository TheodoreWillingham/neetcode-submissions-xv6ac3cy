class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int runningSum = nums[0];
        // go through each value and discard if it becomes neg
        for (int i = 1; i < nums.length; i++) {
            //if new number is greater track it (used for negative values)
            maxSum = Math.max(maxSum, nums[i]);
            //get new running sum
            runningSum += nums[i]; 
            // if new running sum is negative (disgard it: Greedy Solution)
            if (runningSum < 0) {
                runningSum = 0;
            } else { //if new running sum is positive
                maxSum = Math.max(maxSum, runningSum);
            }

            // System.out.println("at index " + i + " max sum:" + maxSum + " running sum:" + runningSum);
        }

        return maxSum;
    }
}
