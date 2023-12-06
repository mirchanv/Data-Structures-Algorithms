

# Problem : Same Tree
**Problem Statement:** 
Given the roots of two binary trees  `p`  and  `q`, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.

**Example 1:**

![](https://assets.leetcode.com/uploads/2020/12/20/ex1.jpg)

**Output:** true

**Example 2:**

![](https://assets.leetcode.com/uploads/2020/12/20/ex2.jpg)

**Output:** false

**Example 3:**

![](https://assets.leetcode.com/uploads/2020/12/20/ex3.jpg)

**Output:** false

# Files
Please navigate to the src folder to find the following files as part of the solution for this problem.

 - TreeNode.java  
 - Solution.java 
 - Test.java


# Approach
- Traverse through the tree and keep checking for the following:
	`p == null && q == null` if both are null when passed to your function it means the roots are null which means the trees are same, hence we return ***true*** 
	We must also check for the false case in order to return ***false***
	`p == null || q == null || p.val != q.val` if any of these condition are true for sure they are not same trees
	If none of the above were executed it means node **p** and node **q** have the same values so we must continue to our next node by calling the function recursively for p and q's left and right subtree and return its result. 

# Complexity Analysis
***Time Complexity :***  O(n) for worst case if travelling through all nodes when two trees are identical

***Space Complexity :*** O(n) for recursion stack space in the worst case if tree is skewed
