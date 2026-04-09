class Solution {
public:
    int getSum(int a, int b) {

        while (b) { //while - the carry over is zero
            int carryOver = (a & b);
            a = (a ^ b); // partial sum without carry over
            b = (carryOver << 1); 
        }

        return a;
    }
};
