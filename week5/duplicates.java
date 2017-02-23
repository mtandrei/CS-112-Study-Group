public void duplicates(int[] stream, int max){
  int[] arr = new int[max];

  for(int i = 0; i < stream.length; i++){
    arr[stream[i]]++;
  }

  for(int i = 0; i < arr.length; i++){
    if(arr[i] > 1)
      System.out.println(i + " ");
  }
}
