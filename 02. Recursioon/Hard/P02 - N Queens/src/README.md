Problem Statement: 
The n-queens is the problem of placing n queens on n × n chessboard such that no two queens can attack each other. Given an integer n, return all distinct solutions to 
the n -queens puzzle. Each solution contains a distinct boards configuration of the queen’s placement, where ‘Q’ and ‘.’ indicate queen and empty space respectively.

Examples:

Input: n = 4
Output: [[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
Explanation: There exist two distinct solutions to the 4-queens puzzle as shown below:
![image](https://github.com/mirchanv/Data-Structures-Algorithms/assets/137283854/3e712e6c-d978-4682-8eff-4454a51de010)

Let us first understand how can we place queens in a chessboard so that no attack on either of them can take place.
![image](https://github.com/mirchanv/Data-Structures-Algorithms/assets/137283854/044619fc-23c1-4211-a300-12ae09b71fc2)

Approach to solve the problem using recursion & backtracking:
![image](https://github.com/mirchanv/Data-Structures-Algorithms/assets/137283854/6ebef9c4-0ee0-4ea0-8bbf-1588cd979239)
![image](https://github.com/mirchanv/Data-Structures-Algorithms/assets/137283854/fb8b384c-7b11-49ab-92fd-25b2638abdab)
![image](https://github.com/mirchanv/Data-Structures-Algorithms/assets/137283854/f9aa4d24-805c-4be4-bd82-da7833f059b5)
![image](https://github.com/mirchanv/Data-Structures-Algorithms/assets/137283854/565f8335-0358-4807-90ab-e1eaa1c79e59)

For checking if we can place a queen safely on the chessboard we will use hashing tecnique as shown below:

For checking Left row elements
![image](https://github.com/mirchanv/Data-Structures-Algorithms/assets/137283854/a8fe5892-6c9f-4a4f-96cc-9b0fea0ccda5)

For checking upper diagonal and lower diagonal
![image](https://github.com/mirchanv/Data-Structures-Algorithms/assets/137283854/8eeb9008-c589-434f-b386-73f03cc270a6)


Time Complexity: Exponential in nature since we are trying out all ways, to be precise it is O(N! * N).
Space Complexity: O(N)





