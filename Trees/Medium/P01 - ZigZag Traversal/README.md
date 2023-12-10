# Problem : Binary Tree Zigzag Level Order Traversal
**Problem Statement:** 
Given the  `root`  of a binary tree, return  _the zigzag level order traversal of its nodes' values_. (i.e., from left to right, then right to left for the next level and alternate between).

**Example 1:**

![](https://assets.leetcode.com/uploads/2021/02/19/tree1.jpg)

**Output:** [[3],[20,9],[15,7]]


# Files
Please navigate to the src folder to find the following files as part of the solution for this problem.

 - TreeNode.java  
 - Solution.java 
 - Test.java


# Approach
-   Traverse the tree level by level, meaning go for level order traversal.
-   Maintain one extra boolean variable named **leftToRight** which is initially set to true. 
-   Before adding the the ArrayList of integers of the current level just check `if (!leftToRight)`
-   If the above condition was true that means we need to reverse the ArrayList and then add it to the final List.
-   Else if the condition is not true that mean `leftToRight = true` so we just want to add the ArrayList of integers in that same order to the final List.

# Complexity Analysis
***Time Complexity :***  O(n) for worst case if travelling through all nodes and printing them

***Space Complexity :*** O(n) for recursion stack space in the worst case if tree is skewed
