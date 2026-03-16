class Solution {
    public int minOperations(String s) {
        int st0 = 0;
        char[] a = s.toCharArray();
        int n = a.length;
        for(int i = 0; i < n; i++){
            //int ch = s.charAt(i) - '0';
            //int parity = i & 1;
            st0 += (a[i] - '0') ^ (i & 1); //parity;
            //st1 += ch ^ (parity ^ 1);
        }
        return Math.min(st0, n - st0);
    }
}