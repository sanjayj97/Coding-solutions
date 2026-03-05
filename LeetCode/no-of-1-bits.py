#191. Number of 1 Bits
class Solution:
    def hammingWeight(self, n: int) -> int:
        b = 0
        while n != 0:
            r = n % 2
            if r == 1:
                b+=1
            n = n//2
        return b