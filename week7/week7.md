#Week 6

##Review AVL Trees
 - Cases: LL, RR, LR, RL
 - First two require 1 rotation, other two require 2 rotations (both fall into LL and RR)
 - In first two, imagine pushing "against" the imbalance (to balance right imbalance, perform two left rotations and vice-versa)
 - If we have a right imbalance, we rotate left twice: root's right becomes root, root's right becomes new root's left, old root takes new root's left child
 - Vice versa for left imbalance, do two right rotations.
 - For a right left imbalance, we rotate right first (against the left imbalance) and have fallen into the case of LL
 - For a left right imbalance, we rotate left first (against the right imbalance) and have fallen into the case of RR

##Problems

###Given two large binary trees, T1 with millions of nodes and T2 with hundreds of nodes, write an algorithm to determine of T2 is a subtree of T1.
 - What does it mean for one tree to a subtree of another tree?
 - Idea: Some traversal could reveal that T2 is a substring of T1.
 - Naive solution: use preorder and inorder traversal to check for substrings (why do we need both?)
 - When should we check for subtree match?
 - What is the runtime? (Let's say large tree has size n and smaller tree has size m)
 - Inital instinct is to say O(nm) but we can get a tighter bound
 - Suppose k is the number of times that we see the root of the smaller tree in the larger tree.
 - Above makes runtime O(n + km)

###Given a BST, write a method that creates linked lists of the nodes at each depth (i.e. the nodes at height 0 are in one LL, the nodes at height 1 are in another LL, etc).
 - Think about how we can keep track of what level we're on
 - Hint: Think of a recursive way to do this (There is an iterative solution, but it's hard to come up with if you've never done BFS)
 - What traversal works best for this?
  - Preorder: Want deal with current element first and then do the recursive call
 - Strategy: We pass currentlevel + 1 to child nodes recursively. If a list doesn't exist, just initialize it
 - Iterative: Use BFS (I'll explain this breifly if anyone is interested in doing a non recursive approach)
 - Both approaches take O(n) time, but first one requires n + logn space while the second one only requires n space.
