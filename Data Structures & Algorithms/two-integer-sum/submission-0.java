class Solution {
    public int[] twoSum(int[] nums, int target) {
        //stores value -> index
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            //if target value is in HashMap
            if (map.containsKey(target - nums[i])) {
                return new int[] {map.get(target - nums[i]), i};
            }

            //add value -> index
            map.put(nums[i], i);
        }

        return null;
    }
}
