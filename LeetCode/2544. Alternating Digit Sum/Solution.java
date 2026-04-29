class Solution {
    public int alternateDigitSum(int n) {
        int sum = 0;
        int sum2 = 0;
        int i = 0;
        while(n > 0){
            int r = n % 10;
            n = n/10;
            if(i % 2 == 0){
                sum += r;
                sum2 -= r;
            }
            else{
                sum -= r;
                sum2 += r;
            }
            i++;
        }
        if(i % 2 == 0)return sum2;
        return sum;
    }
}