
# Problem : Balanced Binary Tree
**Problem Statement:** 
Given a binary tree, determine if it is **height-balanced**.

A **height-balanced** binary tree is a binary tree in which the depth/height of the two subtrees of every node never differs by more than one.

**Example 1:**

![](https://assets.leetcode.com/uploads/2020/10/06/balance_1.jpg)

**Output:** true

**Example 2:**

![](https://assets.leetcode.com/uploads/2020/10/06/balance_2.jpg)

**Output:** false

**NOTE:** If root of tree is null it is still considered to be a balanced binary tree!

# Files
Please navigate to the src folder to find the following files as part of the solution for this problem.

 - TreeNode.java 
 - Solution.java 
 - Test.java

# Approach
***NOTE:*** we are going to write a function to find the maz height of the tree. 
- If -1 is returned it means it is not balanced
- If maxHeight of trree is returned it means it is balanced

REMEMBER: A **height-balanced** binary tree is a binary tree in which the depth/height of the two subtrees of every node never differs by more than one. Meaning absolute difference of left and right must be <= 1 for it to be balanced.

-   Start traversing the tree recursively and do work in Post Order.
-   For each node, calculate the height of the node, and return it to previous call.
-   Simultaneously,  check for condition of balance as information of left and right subtree height is available.
-   If either the left or right subtree results in -1 , simply return -1. 
-  If left and right are not -1, then go ahead and find the absolute difference of left and right. If (left - right) <= 1 then it is balanced so far and simply return height of current node and if condition not satisfied then return -1.

# Complexity Analysis
***Time Complexity :***  O(n) for worst case if travelling through all nodes

***Space Complexity :*** O(n) for recursion stack space in the worst case if tree is skewed
