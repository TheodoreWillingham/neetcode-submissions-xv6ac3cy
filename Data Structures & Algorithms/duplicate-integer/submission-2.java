class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Boolean> map = new HashMap<>();

        for (int num : nums) {
            if (map.getOrDefault(num, false) == false) {
                map.put(num, true);
            } else {
                return true;
            }
        }
        return false;
    }
}