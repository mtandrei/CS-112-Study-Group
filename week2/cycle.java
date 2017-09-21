public boolean hasCycle(Node head){
  if(head == null || head.next == null)
    return false;

  Node slow = head;
  Node fast = head.next;
  while(fast != null && fast.next != null){
    if(slow == fast)
      return true;
    fast = fast.next;
    if(fast != null)
      fast = fast.next;
    slow = slow.next;
  }
  return !(fast.next == null);
}
