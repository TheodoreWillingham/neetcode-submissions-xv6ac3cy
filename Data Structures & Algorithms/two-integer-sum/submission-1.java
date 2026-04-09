class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            //check if compliment exists
            int comp = target - nums[i];
            int val = map.getOrDefault(comp, -1);
            if (val < 0) { // if comp doesn't exist
                map.put(nums[i], i);
            } else {
                return new int[] {val, i};
            }
        }
        return null;

    }
}
