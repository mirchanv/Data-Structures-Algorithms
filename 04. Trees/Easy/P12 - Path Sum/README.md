

# Problem : Path Sum
**Problem Statement:** 
Given the  `root`  of a binary tree and an integer  `targetSum`, return  `true`  if the tree has a  **root-to-leaf**  path such that adding up all the values along the path equals  `targetSum`.

A  **leaf**  is a node with no children.

**Example 1:**

![](https://assets.leetcode.com/uploads/2021/01/18/pathsum1.jpg)
**targetSum** = 22

**Output:** true

**Explanation:** The root-to-leaf path with the target sum is shown.

**Example 2:**

![](https://assets.leetcode.com/uploads/2021/01/18/pathsum2.jpg)
**targetSum** = 5

**Output:** false

**Explanation:** There two root-to-leaf paths in the tree:
(1 --> 2): The sum is 3. 
(1 --> 3): The sum is 4. 
There is no root-to-leaf path with sum = 5.

# Files
Please navigate to the src folder to find the following files as part of the solution for this problem.

 - TreeNode.java  
 - Solution.java 
 - Test.java


# Approach
- Keep a sum variable, initially initialised to 0.
- Traverse through the tree and up the values of each node until you reach a leaf node. 
- Once you reach a leaf node check if `sum == target` if true then return true. 

# Complexity Analysis
***Time Complexity :***  O(n) for worst case if travelling through all nodes
***Space Complexity :*** O(n) for recursion stack space in the worst case if tree is skewed
