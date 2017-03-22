public class Solution{
  int max = 0;

  public int diameter(TreeNode root){
    maxDepth(root); //Call to recursive function
    return max;
  }

  private int maxDepth(TreeNode root){
    if(root == null) //base case
      return 0;

    int left = maxDepth(root.left);
    int right = maxDepth(root.right);

    int sum = left + right; //Could be our new max

    max = Math.max(max, left + right); //Determine if the sum is the new max

    return Math.max(left, right) + 1; //return the maximal subtree plus one to the calling function
  }
}
