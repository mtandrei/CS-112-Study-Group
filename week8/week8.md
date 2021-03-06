#Week 8

##Project questions

##Review Huffman Coding
 - Purpose: Compressing data
 - How do we do it? Idea stems from storing characters and their frequencies in one queue and building the huffman tree in another.
 - We insert characters from smallest to largest such that the most frequent characters have the shortest binary representation.
 - At each iteration, we dequeue the two smallest frequencies and build a new tree out of them and store those into the 2nd queue.
 - Can be used to encode and decode strings of characters

##Review Hash Tables
 - Motivation: We want O(1) search time
 - Idea: Map our entries in some way to an array
 - Easiest example: Mod function with integer entries
 - If we add and look up elements in the same way, we get O(1) search time
 - Problem: collisions (consider two integers that have the same mod size value)
 - Many ways to resolve this, but the best is chaining (requires extra sapces, but allows multiple entries to exist at the same spot)
 - Easier way to chain is with linked lists, but most efficient is with AVL tree
 - Note that we can use Key-Value pairs for hash tables

##Problems

###Tree Diameter: Given the root of a binary tree, write a method to computer the diameter of a tree.
 - Diameter of a tree is defined as the longest path between any two nodes in the tree
 - Note that we measure diameter by the number of edges along the path
 - Think of a recursive definition
 - Idea: The diameter is the longest path (or max depth) of the left subtree plus the longest path of the right subtree
 - We can keep track of the computed maximum globally

###Given two arrays, write a method that computes their intersection
 - Naive way: sort and search with two pointers: O(nlogn)
 - If we can afford to use space, we can use a hashtable
 - Time and space are both linear (O(n))
###Path Sum: Given a binary tree, design an algorithm that determines if there exists a root-to-leaf path that sums to a given value.
 - Just traverse and keep track of the sum as its computed so that we can print the path once we hit the sum
 - Note that when we hit a sum, we could still hit that sum again (ex. the path sum is followed by -2, 1, 1)

###Extension: What if we wanted to print the given path? What if the path could go from any node to its children?
 - In what two directions could we compute partial sums?
 - Idea: Pass path to recursive calls and then "look up" to compute partial sums (i.e. instead of seeing if a given node starts a sum path, ask if a given node finishes a sum path)
 - Runtime: O(n*logn)
