# Problem : Binary Tree Maximum Path Sum
**Problem Statement:** 
A  **path**  in a binary tree is a sequence of nodes where each pair of adjacent nodes in the sequence has an edge connecting them. A node can only appear in the sequence  **at most once**. Note that the path does not need to pass through the root.

The  **path sum**  of a path is the sum of the node's values in the path.

Given the  `root`  of a binary tree, return  _the maximum  **path sum**  of any  **non-empty**  path_.

**Example 1:**

![](https://assets.leetcode.com/uploads/2020/10/13/exx1.jpg)

**Output:** 6

**Explanation:** The optimal path is 2 -> 1 -> 3 with a path sum of 2 + 1 + 3 = 6.

**Example 2:**

![](https://assets.leetcode.com/uploads/2020/10/13/exx2.jpg)

**Output:** 42

**Explanation:** The optimal path is 15 -> 20 -> 7 with a path sum of 15 + 20 + 7 = 42.


# Files
Please navigate to the src folder to find the following files as part of the solution for this problem.

 - TreeNode.java  
 - Solution.java 
 - Test.java


# Approach
-   Keep a global integer variable called  `maxi`  initially storing **Integer.MIN_VALUE**
-   Do a simple tree traversal. At each node, find recursively its  `leftMaxPath`  and its  `rightMaxPath`.
-   Calculate the maxPath through the current node as  `node.val + (leftMaxPath + rightMaxPath)`  and update maxi accordingly.
-   Return the maxPath when node is not the curving point as  `node.val + max(leftMaxPath, rightMaxPath)`.

# Complexity Analysis
***Time Complexity :***  O(n) for worst case if travelling through all nodes

***Space Complexity :*** O(n) for recursion stack space in the worst case if tree is skewed
