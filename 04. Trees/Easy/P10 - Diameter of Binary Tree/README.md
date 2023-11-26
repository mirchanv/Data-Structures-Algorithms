

# Problem : Diameter of Binary Tree
**Problem Statement:** 
Given the  `root`  of a binary tree, return  _the length of the  **diameter**  of the tree_.

The  **diameter**  of a binary tree is the  **length**  of the longest path between any two nodes in a tree. This path may or may not pass through the  `root`.

The  **length**  of a path between two nodes is represented by the number of edges between them.


**Example 1:**

![](https://assets.leetcode.com/uploads/2021/03/06/diamtree.jpg)

**Output:** 3

**Explanation:** 3 is the length of the path [4,2,1,3] or [5,2,1,3].


# Files
Please navigate to the src folder to find the following files as part of the solution for this problem.

 - TreeNode.java  
 - Solution.java 
 - Test.java


# Approach
The idea to find the Curving Point, consider every node in the tree as a curving point and calculate the diameter for every curving point and return the maximum of all diameters.

	Diameter at given Curving Point = Left Height + Right Height

-   Traverse the tree recursively.
-   At every node, calculate height of left and right subtrees.
-   Calculate the diameter for every node using the above formula.
-   Calculate the maximum of all diameters. This can be done simply using a variable passed by reference in the recursive calls or a global static variable.

# Complexity Analysis
***Time Complexity :***  O(n) for worst case if travelling through all nodes

***Space Complexity :*** O(n) for recursion stack space in the worst case if tree is skewed
