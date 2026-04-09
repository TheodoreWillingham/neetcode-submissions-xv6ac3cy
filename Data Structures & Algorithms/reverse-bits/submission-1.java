class Solution {
    public int reverseBits(int n) {
        int res = 0; //000000... 0

        for (int i = 0; i < 32; i++) {
            int val = (n >> i) & 1;
            res |= (val <<= 31 - i);
        }

        return res;
    }
}
