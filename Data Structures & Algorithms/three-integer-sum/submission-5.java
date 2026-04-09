class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        //brain storming  -2, -1, -1, 0, 1, 1, 2
        //brain storming -4, -1, -1, 0, 1, 2
        //0, 0, 0
        // sort array
        Arrays.sort(nums);

        // go through each value
        for (int i = 0; i < n; i++) {
            //if (i > n - 3) break; //not enough values to the right
            int curr = nums[i];
            if (curr > 0) break; //can't add positive values to postive value to get zero
            int left = i + 1; //value to the right of curr
            int right = n - 1; //last value in array


            
            //while the two pointers don't meet
            while (left < right) {
                //if you find valid triplet
                if (curr + nums[left] + nums[right] == 0) {
                    //add triplet
                    res.add(List.of(curr, nums[left], nums[right]));
                    //look for other pairs that aren't duplicates
                    while (left + 1 < right && nums[left] == nums[left + 1]) left++;
                    while (left < right - 1 && nums[right] == nums[right - 1]) right--;
                    left++; 
                    right--;
                } else if (curr + nums[left] + nums[right] > 0) {
                    right--;
                } else {
                    left++;
                }
            }

            //get rid of duplicates
            while (i < n - 3 && curr == nums[i + 1]) i++;

        }
        return res;
    }
}
