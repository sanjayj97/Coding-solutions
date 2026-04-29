class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int dis = 0;
        int j = 0;
        for(int i = 0; i< n; i++){
            int v = nums1[i];
            while( j < m && nums2[j] >= nums1[i]){
                j++;
            }
            int d = j - i - 1;
            dis = (dis > d)? dis : d;
        }
        return dis;
    }
}