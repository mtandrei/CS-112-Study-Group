public void func(int[] arr){
  for(int i = 1; i < n; i++){
    int num = arr[i];
    int j = i-1;
    while(j >= 0 && arr[j] > num){
      arr[j+1] = arr[j];
      j--;
    }
    arr[j+1] = key;
  }
}
