public class Solution{
  public TreeNode(){
    int data;
    TreeNode left;
    TreeNode right;
  }

  public boolean containsTree(TreeNode t1, TreeNode t2){
    if(t2 == null) //empty tree is always a subtree
      return true;
    return subtree(t1, t2);
  }

  public boolean subtree(TreNode t1, TreeNode t2){
    if(t1 == null)
      return false;

    if(t1.data == t2.data && matchTree(t1, t2))
      return true;
    
    return subtree(t1.left, t2.left) || subtree(t1.right, t2.right);
  }

  public boolean matchTree(TreeNode t1, TreeNode t2){
    if(t1 == null && t2 == null)
      return true;

    //if one is null and the other is not, we return null
    if(t1 == null || t2 == null)
      return false;

    //if the data doesn't equal, then they don't match
    if(t1.data != t2.data)
      return false;

    return matchTree(t1.left, t2.left) && matchTree(t1.right, t2.right);
  }
}
