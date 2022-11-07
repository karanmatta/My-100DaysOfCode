Backtracking
In this topic, we will learn about the backtracking, which is a very important skill set to solve recursive solutions. Recursive functions are those that calls itself more than once. Consider an example of Palindrome:

Initially, the function isPalindrome(S, 0, 8) is called once with the parameters isPalindrome(S, 1, 7). The recursive call isPalindrome(S, 1, 7) is called once with the parameters isPalindrome(S, 2, 6).

Backtracking is one of the techniques that can be used to solve the problem. We can write the algorithm using this strategy. It uses the Brute force search to solve the problem, and the brute force search says that for the given problem, we try to make all the possible solutions and pick out the best solution from all the desired solutions. This rule is also followed in dynamic programming, but dynamic programming is used for solving optimization problems. In contrast, backtracking is not used in solving optimization problems. Backtracking is used when we have multiple solutions, and we require all those solutions.

Backtracking name itself suggests that we are going back and coming forward; if it satisfies the condition, then return success, else we go back again. It is used to solve a problem in which a sequence of objects is chosen from a specified set so that the sequence satisfies some criteria.

When to use a Backtracking algorithm?
When we have multiple choices, then we make the decisions from the available choices. In the following cases, we need to use the backtracking algorithm:

A piece of sufficient information is not available to make the best choice, so we use the backtracking strategy to try out all the possible solutions.
Each decision leads to a new set of choices. Then again, we backtrack to make new decisions. In this case, we need to use the backtracking strategy.