Node reverse(Node head){
  //base case
  if(head == null || head.next == null)
    return head;

  //Recursive Step:
  //1) Get a handle to the reverse of the rest of the linked list
  //EX: Given 1->2->3, calling reverse on 2 should give us 3->2
  Node rev = reverse(head.next);
  //2) Note that head.next STILL points to 2 in the previous example after the recursive call. As such, we can exploit this: Get a handle to the next of 2 with head.next.next (head.next still points to 2) and set that to head:
  head.next.next = head;
  //3) Now that head is at the end of the list (where it should be) we want it to point to null
  head.next = null;
  return rev;
}
