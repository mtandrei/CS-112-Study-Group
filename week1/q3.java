public boolean func(int[] a, int[] b){
  for(int i: a){
    if(otherFunc(i, b, 0, b.length) < 0)
      return false;
  }
  return true;
}

private int otherFunc(int i, int[] b, int l, int u){
  if(l > u)
    return -1;
  int m = (l+u)/2;
  if(b[m] == i){
    return m;
  }else if(b[m] < i){
    return otherFunc(i, b, m+1, u);
  }else{
    return otherFunc(i, b, l, m);
  }
}
