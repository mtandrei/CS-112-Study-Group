public class Solution{

  public void findSum(TreeNode root, int sum){
    int[] path = new int[depth(root)]; //Note: we need an array because ArrayList is an object and java is pass by reference
    findSum(root, sum, path, 0);
  }

  private int depth(TreeNode root){
    if(root == null)
      return 0;
    return 1 + Math.max(depth(root.left), depth(root.right));
  }

  private void findSum(TreeNode root, int sum, int[] path, int level){
    if(root == null)
      return;

    path[level] = root.data; //Insert the current node into the path

    //see if we have a path that ends at this node
    int partialSum = 0;
    for(int i = level; i >= 0; i--){
      t+=path[i];
      if(t == sum) //found a match, print path
        printPath(path, i, level);
    }

    //Recursive calls to children
    findSum(root.left, sum, path, level + 1);
    findSum(root.right, sum, path, level + 1);
  }

  private void printPath(int[] path, int start, int end){
    for(int i = start; i <= end; i++){
      System.out.print(path[i] + " ");
    }
    System.out.println();
  }
}
