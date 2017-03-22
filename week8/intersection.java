public class Solution{
  public ArrayList<Integer> intersection(int[] nums1, int[] nums2){
    Set<Integer> hashtable = new HashSet<Integer>();
    ArrayList<Integer> result = new ArrayList<Integer>();

    //Populate hash table with our first list
    for(int i = 0; i < nums1.length; i++){
      hashtable.add(new Integer(nums1[i]));
    }

    //if it's in the hash table, then we know that it's in both
    for(int i = 0; i < nums2.length; i++){
      Integer obj = num2[i];
      if(hashtable.contains(obj))
        result.add(obj);
    }

    return result;
  }
}
