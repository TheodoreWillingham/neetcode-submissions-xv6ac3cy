class Solution {
public:
    bool isAnagram(string s, string t) {
        int n = s.size();
        if (n != t.size()) return false; //different size error
        unordered_map<char, int> map;

        const char * charS = s.c_str();
        const char * charT = t.c_str();

        for (int i = 0; i < n; i++) {
            //if negative value exists
            if (map[*(charS + i)] == -1) {
                map.erase(*(charS + i));
            } else {
                map[*(charS + i)]++;
            }
            //if postive value exists
            if (map[*(charT + i)] == 1) {
                map.erase(*(charT + i));
            } else {
                map[*(charT + i)]--;
            }
        }

        return map.empty();
    }
};
