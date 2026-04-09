class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right)/2;
            int leftVal = nums[left], rightVal = nums[right], midVal = nums[mid];

            //debugging
            // System.out.println("left " + left + " mid " + mid + " right " + right );
            // System.out.println("leftVal " + leftVal + " midVal " + midVal + " rightVal " + rightVal);
            
            if (midVal == target) { // if you found target
                return mid;
            } 

            if (leftVal <= midVal) { //the left side is sorted
                if (leftVal <= target && midVal >= target) { // target is within here
                    right = mid - 1;
                } else { //target must be in other array
                    left = mid + 1;

                }
            } else { //the right side must be sorted
                if (midVal <= target && rightVal >= target) { //traget within
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

        }

        return -1;
    }
}
