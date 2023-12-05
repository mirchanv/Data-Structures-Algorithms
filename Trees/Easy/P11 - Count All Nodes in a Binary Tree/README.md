# Problem : Count All Nodes In Binary Tree
**Problem Statement:** 
Given the  `root`  of a binary tree, return  the total number of nodes in the binary tree.
**Note:** If root is `null` then return 0.	

**Example 1:**

![](https://assets.leetcode.com/uploads/2021/01/14/complete.jpg)
**Output:** 6

# Files
Please navigate to the src folder to find the following files as part of the solution for this problem.

 - TreeNode.java  
 - Solution.java 
 - Test.java


# Approach
-   Traverse the tree recursively. Sum up all the nodes of the left subtree and right subtree + the current node and return to previous recursive call.

# Complexity Analysis
***Time Complexity :***  O(n) for worst case if travelling through all nodes

***Space Complexity :*** O(n) for recursion stack space in the worst case if tree is skewed
