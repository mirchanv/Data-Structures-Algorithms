
# Problem : Boundary Traversal of Binary Tree
**Problem Statement:** 
Given a binary tree, print boundary nodes of the binary tree ****Anti-Clockwise**** starting from the root.

**Example:**

![image](https://github.com/mirchanv/Data-Structures-Algorithms/assets/137283854/26c37411-3cdb-4589-b5cf-b1670a994a75)



# Files
Please navigate to the src folder to find the following files as part of the solution for this problem.

 - TreeNode.java  
 - Solution.java 
 - Test.java


# Approach
We can break down the problem into three parts:
-   Left Boundary Nodes
-   Leaf Nodes
-   Right Boundary Nodes

**Left Boundary Nodes:** Firstly add all left boundary nodes except leaf nodes to the answer List.

**Leaf Nodes:** Then add all the leaf nodes to the answer List. 

**Right Boundary Nodes:** Finally add all right boundary nodes except leaf nodes to the answer List in reversed order. Why reversed? Because we are following the boundary anti-clockwise!

# Complexity Analysis
***Time Complexity :***  O(n) for worst case if travelling through all nodes

***Space Complexity :*** O(n) for recursion stack space in the worst case if tree is skewed
