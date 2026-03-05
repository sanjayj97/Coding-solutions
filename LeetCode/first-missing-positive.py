#41. First Missing Positive
class Solution:
    def firstMissingPositive(self, nums: List[int]) -> int:
        m = max(nums)
        s = set(nums)
        if m < 0:
            return 1
        for i in range(1,m):
            if i not in s:
                return i
        return m+1