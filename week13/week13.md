#Week 13

##Review of Sorting
###QuickSort
- Approach: At each iteration, we put one element into its proper place into the array
- Algorithm to do this is called the split/partition procedure.
- Idea: Pick an element (for simplicity we pick the first element). This is our pivot element.
- Have two indices, one at the beginning and end of the array and proceed as follows: Move the left pointer right until we encounter an element greater than the pivot. Then, we move the right pointer left until we find an element less than the pivot. If the pointers haven't crossed, swap these elements and increment them appropriately. Continue this process until our pointers cross, at which point we swap the pivot with the right pointer.
- We now repeat this on the left and right subarrays which remain.
- Worst case: O(n^2).
- It can be shown, however, that on average quicksort takes O(nlogn)

###HeapSort
- Idea: Since heap returns maximal element, why don't we keep removing the max and moving it to the back of our array?
- Do this after we heapify our array (sift down in reverse array order)
- Time to build a heap: O(n)
- Heapsort itself takes O(nlogn)

##Problems

###Given two sorted arrays A and B where A has enough extra space to hold B, design an algorithm that merges B into A.
- How can we take advantage of the fact that the arrays are sorted?
- Idea: Have pointers at the end of both arrays and then pick the maximal element and move it to the back.
- Runtime: O(m+n).

###Given two sorted arrays, find the median across both sets.
- Naive solution: Merge them, sort them and pick the middle element. This takes O(nlogn)
- Better solution: Use two finger method until we've looked at (m+n)/2 elements. If we have an even number of elements, take the average of (m+n)/2 and (m+n+1)/2. O(n) solution.
- Can we do better?
- Hint: we know the median of both lists. What does that tell us about the median of the whole set?
- Let m1 be the median of the first array and m2 be the median of the second array.
- We know that if m1 == m2, then we're done.
- If m1 > m2, then our median is in the first half of array 1 or the second half of array 2
- If m1 < m2 then our median is in the first half of array 2 or the second half of array 1
- Once we branch, we compute new medians.
- We repeat this process until m1 == m2 OR we have arrays of size two. If this is the case, then our median is the average of the max of the first two elements and the min of the last two elements (ex. given [9, 18] and [15, 20], our median is (15+18)/2.
- Best solution: O(logn)
- Solution: http://www.geeksforgeeks.org/median-of-two-sorted-arrays/

###Given a list of 7 digit phone numbers, determine if there are any duplicates.
- Naive way: Compare every element against every element. This takes O(n^2) time.
- Can we use extra space to do a better job?
- Set up a Hashtable. If we've seen something before, we can look for it in the hash table.
- O(n) time and space.
