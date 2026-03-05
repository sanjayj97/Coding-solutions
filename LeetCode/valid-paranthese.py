#20. Valid Parentheses
class Solution:
    def isValid(self, s: str) -> bool:
        bracket = {')':'(', '}':'{', ']':'['}
        stack = []

        for i in s:
            if i in bracket:
                if not stack or bracket[i] != stack.pop():
                    return False
            else:
                stack.append(i)
        return not stack 
        