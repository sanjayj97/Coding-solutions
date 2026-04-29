class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] arr = new int[n];
        int max = nums[0];
        arr[n-1] = nums[n-1];
        for(int i = n -2; i >= 0; i--){
            if(nums[i] < arr[i + 1]){
                arr[i] = nums[i];
            }
            else{
                arr[i] = arr[i + 1];
            }
        }
        for(int i = 0; i < n; i++){
            if(max - arr[i] <= k){
                return i;
            }
            if(nums[i] > max){
                max = nums[i];
            }
        }
        return -1;
        
    }
}