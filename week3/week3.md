#Week 3

#Topics:

##Stacks
-FILO Data Structure
-Add items with push()
-Remove with pop()
-Examine top with peek()
-Can be implemented using arrays OR linked lists (which would be better?)

##Queues
-FIFO Data Structure
-Add items with enqueue()
-Remove with dequeue()
-Examine head with peek()
-Can be implemented using arrays OR linked lists (which would be better?)

##Problems

###Implement a queue using two stacks

Solution: Use one stack to store the newest elements and the other one for dequeuing.

This ensures that n consecutive queues or dequeues is done in O(n), but n interspersed operations can take O(n^2) in the worst case.

###Implement an algorithm to sort a stack in ascending order. You may use an additional stack.

Naive Solution: Sift through the stack n times looking for the minimum element. O(n^2) (But violates initial restriction!)

Optimal Solution: Keep popping from "sorted" stack until we peek an element that is less than the element that we are trying to add. O(n^2).
