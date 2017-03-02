//Need this to class level because every recursive call must have direct access to this variable.
public static int last_seen = Integer.MIN_VALUE;

//This implementation leverages the idea of inorder traversal:
//We check if each node is greater than it's inorder predecessor
public static boolean checkBST(TreeNode n){
  if(n == null)
    return true;

  //If the left subtree is a BST, continue. If not, return false
  if(!checkBST(n.left))
    return false;

  //If n.data is NOT greater than its inorder predecessor, then it's not a BST
  if(n.data <= last_seen)
    return false;

  //Update last seen to current node
  last_seen = n.data;

  //Check right subtree:
  if(!checkBST(n.right))
    return false;

  return true;
}
