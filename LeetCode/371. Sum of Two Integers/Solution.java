class Solution {
    public int getSum(int a, int b) {
        while ( b != 0){
            int r = a ^ b;
            int c = (a & b) << 1;
            a = r;
            b = c;
        }
        return a;
    }
}