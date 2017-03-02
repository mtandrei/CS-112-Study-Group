public static boolean checkBST(TreeNode n, int min, int max){
  //Empty tree is a BST by vacuity
  if(n == null)
    return true;
  //If not in BST order, then return false
  if(left > n || n >= right)
    return false;
  //Return the results of the recursive calls (with updated mins and maxes)
  return checkBST(n.left, min, n.data) && checkBST(n.right, n.data, max);
}
