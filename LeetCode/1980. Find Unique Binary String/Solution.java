class Solution {
    public String findDifferentBinaryString(String[] nums) {
        char[] s = new char[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(nums[i].charAt(i) == '1'){
                s[i] = '0';
            }
            else{
                s[i] = '1';
            }
        }
        return new String(s);
    }
}