class Solution {
    public int[] productExceptSelf(int[] nums) {
        int total = 1;
        int zeroCounter = 0;
        int zeroLocation = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCounter++;
                zeroLocation = i;
            } else {
                total *= nums[i];
            }
            if (zeroCounter > 1) return new int[nums.length];
        }

        //special case if there is only one zero
        if (zeroCounter == 1) {
            nums = new int[nums.length];
            nums[zeroLocation] = total;
            return nums;
        } 

        //if normal case
        for (int i = 0; i < nums.length; i++) {
            nums[i] = total / nums[i];
        }

        return nums;

    }
}  
