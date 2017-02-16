boolean isPalindrome(Node head){
  Node fast = head;
  Node slow = head;

  Stack<Integer> stack = new Stack<Integer>();

  //Get first half elements into the stack
  
  while(fast != null && fast.next != null){
    stack.push(slow.data);
    slow = slow.next;
    fast = fast.next.next;
  }

  if(fast != null){
    slow = slow.next;
  }

  while(slow != null){
    int top = stack.pop();

    if(top != slow.data)
      return false;
    slow = slow.next;
  }
  return true;
}
