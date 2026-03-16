class Solution {
    public int arrayNesting(int[] nums) {
        //boolean[] visited = new boolean[nums.length];
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            int c = 0;
            int j = i;
            while(nums[j] != -1){
                int next = nums[j];
                nums[j] = -1;
                j = next;
                c++;
            }
            max = Math.max(max, c);
        }
        return max;
    }
}