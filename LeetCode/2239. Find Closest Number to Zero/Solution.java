class Solution {
    public int findClosestNumber(int[] nums) {
        int min = Integer.MAX_VALUE;
        int val = 0;
        for(int i : nums){
            int n = (i < 0)? -i : i;
            if(n < min || (n == min && n > val)){
                min = n;
                val = i;
            }
        }
        return val;
    }
}