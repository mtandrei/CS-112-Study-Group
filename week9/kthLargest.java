//Heap approach to kthLargest problem
public int kthLargest(int[] nums, int k){
  PriorityQueue<Integer> heap = new PriorityQueue<Integer>();

  for(int i = 0; i < nums.length; i++){
    heap.offer(nums[i]); //offer is insert
    if(k > heap.size())
      heap.poll();
  }

  return heap.peek();
}
