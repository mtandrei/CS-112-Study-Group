#Week 5

##Take Questions/Briefly review exam material  (10-20 min)

##Problems (Note: Do analysis for all of them)

###Given two linked lists that each represent a base 10 number where the digits are stored in reverse order (i.e the least significant digit comes first), design an algorithm to add the two numbers and store the result in a new linked list. Assume all numbers are greater than 0.
- Ex: The operation 617 + 123 would be represented as 7 -> 1 -> 6 -> / and 3 -> 2 -> 1 -> /
- Recall the algorithm to add 2 numbers on paper. The algorithm to do this with linked lists is very similar.
- Analysis: O(m+n) where m and n and the number of digits in each list.
- Follow up: Using this approach, how can we multiply two lists formatted in the same way? (Efficiency is now O(nm)).

###Given a random stream of integers within the range [1,100], design an algorithm that reports duplicate values in the array.
- Ex: Input: 1, 45, 50, 2, 100, 2, 1 --> Output 1,2
- Design the most efficient algorithm using ANY data structure learned so far.
- Optimal Solution: Use array of size n -> Gives us O(n)
- Follow up: What if the range was much larger (say -1 billion to 1 billion)?
- Depends what you want to optimize/what resources you have available.
- Optimize for speed: Use array strategy
- Optimize for space: Use linked list strategy (Create a new node for each new element seen). Would be O(n^2).

###Given a linked list, find the kth to last element.
- Ex: Given 1 -> 2 -> 3 -> 4 -> /, the 1st to last is 4, 2nd to last is 3, etc.
- Go over naive solution
- How can we optimize it?
- Iterative: Use a temp pointer
- Recursive (tricky; we have to print the solution in this case and not return it)
