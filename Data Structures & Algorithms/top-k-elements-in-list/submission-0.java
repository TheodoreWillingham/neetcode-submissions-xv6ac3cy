class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] topK = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        //count the frequency
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        heap.addAll(map.entrySet());

        for (int i = 0; i < k; i++) {
            topK[i] = heap.poll().getKey();
        }
        return topK;
    }
}
