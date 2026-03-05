#136. Single Number
class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        xor = nums[0]
        for n in nums[1:]:
            xor ^= n
        return xor