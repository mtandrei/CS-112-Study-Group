#Week 6

##Take Project Questions/Do overview (10-20 min)

##Review BSTs briefly
- Insertion: Think of branching in Binary Search
  - Recursive algorithm follows
- Deletion: Similar to insertion where we branch to find the element to delete, but we have multiple cases:
  - Case 1: No children: Delink the node from its parent
  - Case 2: One child: Have delete node point to child of node to delete
  - Case 3: Two children: Find inorder successor of node to delete (follow left branch of deletion node's right child: we want the minimal element that is greater than the node to delete). Now we can delete the successor (guaranteed to be a leaf) and replace the node that we want to delete with its successor's value.

##Problems

###Write a method to determine if a binary tree is a binary search tree
 - Start with any solution, but try to close in on optimal solution.
 - Naive solution: Traverse BT, dump it into an array and compare
   - O(n) time and space
 - How do we cut down on space usage?
   - Hint: For every element in the tree, how many elements do we compare it to? (Answer is exactly one).
   - Reduces to O(1) space.
 - What if we didn't want to allocate any extra space at all?
   - Hint: Think about what makes a BST a BST
 - Key: Not only does the left need to be less and the right need to be greater, but ALL left nodes and ALL right nodes must have this.
   - Can we check for this efficiently? YES: Just keep track of the minimal left value and the maximal right value.
   - I.E. When we branch left, we update the maximal right value to the root. Branching right -> update minimal left value to the root
 - O(n) solution. (Note: Could be up to O(n) space because we could have n method calls -> n stack frames).


###Given a BST, write a method that creates linked lists of the nodes at each depth (i.e. the nodes at height 0 are in one LL, the nodes at height 1 are in another LL, etc).
 - Think about how we can keep track of what level we're on
 - Hint: Think of a recursive way to do this (There is an iterative solution, but it's hard to come up with if you've never done BFS)
 - What traversal works best for this?
  - Preorder: Want deal with current element first and then do the recursive call
 - Strategy: We pass currentlevel + 1 to child nodes recursively. If a list doesn't exist, just initialize it
 - Iterative: Use BFS (I'll explain this breifly if anyone is interested in doing a non recursive approach)
 - Both approaches take O(n) time, but first one requires n + logn space while the second one only requires n space. 
