public class Node{
  int data;
  Node next;
}

public class LinkedList{
  public int sum(Node front){
    if(front == null)
      return 0;
    return front.data + sum(front.next);
  }

  public Node search(Node front, int value){
    if(front == null)
      return null;
    if(front.data == value)
      return front;
    return search(front.next, value);
  }
}
