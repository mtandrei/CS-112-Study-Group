public static int binarySearch(int[] arr, int target){
  return binSearch(arr, target, 0, arr.length - 1);
}

private int binSearch(int[] arr, int t, int low, int high){
  //base cases
  if(low > high) //nowhere left to search, isn't in array
    return -1;

  int mid = (low + high)/2;

  if(arr[mid] == t){
    return mid;
  }else{
    if(arr[mid] < t){ //upper half
      return binSearch(arr, t, mid + 1, high);
    }else{ //lower half
      return binSearch(arr, t, low, mid -1);
    }
  }
}
