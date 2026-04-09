class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> hashMap = new HashMap<>();

        for (int num: nums) {
            int count = hashMap.getOrDefault(num, 0);
            hashMap.put(num, count + 1);
            if (count > 0) {
                return true;
            }
        }
        return false;
    }
}