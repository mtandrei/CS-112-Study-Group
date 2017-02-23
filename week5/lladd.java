public Node add(Node l1, Node l2){
  if(l1 == null)
    return l2;
  if(l2 == null)
    return l1;
  boolean carry = false;
  Node result = null;
  Node last = null;

  //addition through both lists
  while(l1 != null && l2 != null){
    int sum = l1.data + l2.data;
    if(carry)
      sum++;
    if(sum > 9){
      carry = true;
      sum-=10;
    }else{
      carry = false;
    }
    Node n = new Node(sum, null);
    if(result == null){
      result = n;
    }else{
      last.next = n;
    }
    last = n;
    
    l1 = l1.next;
    l2 = l2.next;
  }

  while(l1 != null){
    int sum = l1.data;
      if(carry)
        sum++;
      if(sum > 9){
        carry = true;
        sum-=10;
      }else{
        carry = false;
      }
    Node n = new Node(sum, null);
      if(result == null){
        result = n;
      }else{
        last.next = n;
      }
      last = n;
    l1 = l1.next;
  }

  while(l2 != null){
      int sum = l2.data;
      if(carry)
        sum++;
      if(sum > 9){
        carry = true;
        sum-=10;
      }else{
        carry = false;
      }
      Node n = new Node(sum, null);
      if(result == null){
        result = n;
      }else{
        last.next = n;
      }
      last = n;
    l2 = l2.next;
  }
  return result;
}
