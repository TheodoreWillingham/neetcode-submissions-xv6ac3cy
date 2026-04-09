class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> res = new HashMap<>();

        //for each string
        for (String str : strs) {
            int[] count = new int[26]; //a - z
            for (char c : str.toCharArray()) {
                count[c - 'a']++;
            }
            String key = Arrays.toString(count);
            res.putIfAbsent(key, new ArrayList<String>());
            res.get(key).add(str);  
        }
        return new ArrayList<>(res.values());
    }
}
