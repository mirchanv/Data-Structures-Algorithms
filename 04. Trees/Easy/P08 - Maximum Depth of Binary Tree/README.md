
# Problem : Maximum Depth of Binary Tree
**Problem Statement:** 
Given the  `root`  of a binary tree, return  _its maximum depth_.

A binary tree's  **maximum depth** is the number of nodes along the longest path from the root node down to the farthest leaf node.

**Example 1:**

![](https://assets.leetcode.com/uploads/2020/11/26/tmp-tree.jpg)

**Output:** 3

**Explanation:** Longest path is either [3, 20, 15] or [3, 20, 7] whichever we choose the result is the same that is 3. hence maximum depth of this binary tree is 3. 


# Files
Please navigate to the src folder to find the following files as part of the solution for this problem.

 - TreeNode.java  
 - Solution.java 
 - Test.java

# Approach
-   We start to travel recursively and do our work in PostOrder.
-   Reason behind using Post Order comes from our intuition, that if we know the result of left and right child then we can calculate the result using that.
-   This is exactly an indication of PostOrder, because in PostOrder we already calculated results for left and right children than we do it for current node.
-   So for every node post order, we do Max( left result, right result ) + 1 and return it to the previous call. +1 is for the current node itself. Max of left and right because we want to find the max depth/height from current node through its left subtree and right subtree.
-   Base Case is when root == null so we need to return 0;

# Complexity Analysis
***Time Complexity :***  O(n) as we are travelling through every node

***Space Complexity :*** O(n) for recursion stack space in the worst case if tree is skewed
