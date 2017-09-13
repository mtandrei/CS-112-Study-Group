public boolean func(int x, int[] arr){
  for(int i : arr){
    if(x == i)
      return true;
  }
  return false;
}
