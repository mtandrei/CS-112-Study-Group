public Node merge(Node ptr1, Node ptr2){
  if(ptr1 == null)
    return ptr2;
  if(ptr2 == null)
    return ptr1;
  if(ptr1.data > ptr2.data){
    ptr2.next = merge(ptr1,ptr2.next);
    return ptr2;
  }else{
    ptr1.next = merge(ptr.next, ptr2);
    return ptr1;
  }
}
