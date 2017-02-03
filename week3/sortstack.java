public static Stack<Integer> sort(Stack<Integer> stk){
  Stack<Integer> sorted = new Stack<Integer>();

  //Want original stack to be emptied
  while(!stk.isEmpty()){
    Integer tmp = s.pop(); //Get the next element to add

    //Keep popping from the sorted stack until we find the first element that is less than "tmp"
    while(!sorted.isEmpty() && sorted.peek().compareTo(tmp) > 0){
      stk.push(sorted.pop());
    }
    sorted.push(tmp);
  }
  return sorted;
}
