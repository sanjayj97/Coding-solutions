#4. Median of Two Sorted Arrays
class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        nums1.extend(nums2)
        nums1.sort()
        l = len(nums1)
        c = l//2
        if(l%2 == 0):
            m = (nums1[c - 1] + nums1[c])/2.0
        else:
            m = nums1[c]            
        return m

        