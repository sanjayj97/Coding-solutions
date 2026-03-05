#1748
class Solution:
    def sumOfUnique(self, nums: List[int]) -> int:
        l = list(set(nums))
        sum = 0
        for i in l:
            if(nums.count(i) == 1):
                sum+= i
        return sum
        