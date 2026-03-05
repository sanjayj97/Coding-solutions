#14. Longest Common Prefix
class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        ind = 0
        op = ""
        while ind < len(strs[0]):
            c = strs[0][ind]
            for j in range(1, len(strs)):
                if ind >= len(strs[j]) or strs[j][ind] != c:
                    return op
            op = op + c
            ind += 1
        return op