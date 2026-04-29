class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int sums = 0;
        for(int i: nums2){
            sums += i;
        }
        for(int i: nums1){
            sums -= i;
        }
        return sums/nums1.length;
    }
}