//693. Binary Number with Alternating Bits
class Solution {
    public boolean hasAlternatingBits(int n) {
        int i = -1;
        while (n!=0){
            int b = n & 1;
            if ( b == i){
                return false;
            }
            i = b;
            n >>=1;
        }
        return true;
    }
}