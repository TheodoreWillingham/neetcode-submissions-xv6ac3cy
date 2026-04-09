class Solution {
    public int longestConsecutive(int[] nums) {
        //create hashSet
        Set<Integer> set = new HashSet<>();
        int longestConsecutive = 0;

        for (int num : nums) {
            set.add(num);
        }

        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int counter = 0;
                while(set.contains(num++)) counter++;
                longestConsecutive = Math.max(longestConsecutive, counter);
            }
        }



        return longestConsecutive;
    }
}
