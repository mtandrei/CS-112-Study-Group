public Node kthtolast(Node head, int k){
  if(k <= 0) return null;
  //Advance temp pointer k forward:
  Node temp = head;
  for(int i = 0; i < k - 1; i++){
    if(temp == null){
      return null;
    }
    temp = temp.next;
  }
  //Start another pointer from the start: when temp hits null we've found our k to last
  Node klast = head;
  while(temp != null){
    temp = temp.next;
    klast = klast.next;
  }

  return klast;
}

//NOTE: If we wanted to actually return the node containing the kth to last element, we'd have to define a "wrapper class" that contains both the Node's info and the position in the list
public int kthrecursive(Node head, int k){
  //base case: empty list is 0th to last
  if(head == null)
    return 0;

  int i = kthrecurisve(head.next, k) + 1;
  if(i == k){
    System.out.println(head.data);
  }
  return i;
}
