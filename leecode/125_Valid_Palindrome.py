# -*- coding: utf-8 -*-

class Solution(object):
    def isPalindrome(self, s):
# 문자와 숫자 외 나머지 필터링
        strs = []
        for char in s:
            if char.isalnum():
                strs.append(char.lower())
        
        return strs == strs[::-1] #슬라이싱
    
Solution(object);