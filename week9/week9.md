#Week 9

##Review Heaps
- Motivation: Given a set of numbers, we sometimes only want the minimum or the maximum of the set
- Idea: Build a (complete) binary tree where the root is the min of the entire set
- Both children are greater than the node itself
- Insertion: Add to the end of heap and then "sift up"
- Removal: To do this, we "swap" the root and the last (lowest and rightmost) entry in the tree, remove the last element, and sift the new root down to maintain heap ordering
- Both of the above take O(logn) time (how is this guaranteed?)
- Note: we visualize a heap with a binary tree, but implement it as an array because sifting operations are much easier
- Given an index k, we know that the index's parent is (k-1)/2 and both of its children with 2k+1 and 2k+2 respectively.
- Particularly useful in graph algorithms.


##Problems

###Design an algorithm to find the frequency of occurrences of any given word in a book.
- Depends on how many words we are looking up (how many queries)
- If one query, just look through the whole book.
- If multiple, just set up a hash map
- Key value pair: Word, Occurrence.
- Takes O(n) preprocessing time and O(n) space, but O(1) lookup time.

###Design an algorithm that finds the kth largest element in a set of numbers
- Idea: Dump set into a heap and then keep popping k times
- O(nlogn) solution
- (Note: There's an algorithm that, on average, is O(n) but in the worst case is O(n^2))

###Given a string containing upper and lower case characters, design an algorithm that sorts the groups of characters by frequency
- Ex. The string "tree" could be sorted as "eetr" or "eert"
- Two parts to the problem: 1) Count the frequency of each character 2) Sort these character groups
- Part 1 can be done with a hashmap (key value mapping here is character -> number of occurrences)
- Part 2 can be easily done with a heap (dump Mappings into the heap and then build string as we get max)
- NOTE: The attached code has some advanced Java concepts (i.e. defining a custom comparator), so don't worry if you don't understand the solution code as long as you understand the algorithm
- This is O(nlogn)
