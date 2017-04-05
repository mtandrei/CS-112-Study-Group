#Week 10

##Anouncement: Review sessions on Friday at 7pm in SERC 216

##Take questions/review about exam (BSTs, AVLs, Huffman Coding, Hashtables)

##Problems:

###Minimum Absolute Difference in a BST: Given a BST with nonnegative numbers, find the minimum absolute difference between any two nodes.
- Hint: if the elements were sorted, how would you determine this?
- How do we get elements in sorted order from a BST?
- Solution: Do an inorder traversal
- Takes O(n) time

###Two Sum: Given an array of numbers, find the two numbers in the array that add up to a given sum (NOTE: You may assume that there is exactly one pair that does this)
- Brute force solution is SLOW: Takes O(n^2).
- What could we do with additional space?
- Idea: Set up a hashtable. As we go through the hashtable, we can check if the difference between the target AND the current element is a key.
- O(n) time and space

###Isomorphic Strings: Given two strings s and t, design an algorithm to determine if they are isomorphic, that is, they have the same structure.
- In other words, can we map the characters from s to t?
- Need a one to one correspondance between characters (need a bijection)
- Idea: Map characters from s to t using a key value pair
- This pairing can be stored in a hash table
- O(n) time and space
