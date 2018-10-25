# Exercise 11: Zero-Sum Subsequence

**CPEN 221**

Given a list of integers, find the length of the longest subsequence that has a sum of 0. If there is no subsequence that has a sum of 0 then your algorithm would return 0.
This problem can be solved with recursion (and even without). 
Can you identify the recursive solution?
A subsequence is a set of elements, in order, but not necessarily consecutive.


- [2, -2]
    - Returns: 2
    - The subsequence is 2, -2.
- [3, 4, -2, -1]
    - Returns: 3
    - The subsequence is 3, -2, -1.
- [-1, -1, 2, -1, -2, 4]
    - Returns: 4
    - The subsequence is -1, -1, -2, 4.
- [1, 2, 0]
    - Returns: 1
    - The subsequence is 0.
- [1, 1, 2]
    - Returns: 0
    - There is no 0-sum subsequence.
