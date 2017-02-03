public class MyQueue<T>{
  Stack<T> newStack;
  Stack<T> oldStack;

  public MyQueue(){
    newStack = new Stack<T>();
    oldStack = new Stack<T>();
  }

  public void enqueue(T item){
    newStack.push(item);
  }

  public T dequeue(){
    shift();
    return oldStack.pop();
  }

  public T peek(){
    shift();
    return oldStack.peek();
  }

  private void shift(){
    if(oldStack.isEmpty()){
      while(!newStack.isEmpty()){
        oldStack.push(newStack.pop());
      }
    }
  }
}
