class Solution(object):
    def mirrorFrequency(self, s):
        digit = [0] * 10
        letters = [0] * 26

        for c in s:
            if c.isdigit():
                digit[ord(c) - ord('0')] += 1
            else:
                letters[ord(c) - ord('a')] += 1
        res = 0

        for i in range(5):
            res += abs(digit[i] - digit[9-i])
        for i in range(13):
            res += abs(letters[i] - letters[25 - i])

        return res
        