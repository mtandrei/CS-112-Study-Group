void buildLists(TreeNode root, ArrayList<LinkedList<TreeNode>> lists, int level){
  //Base case; just return
  if(root == null)
    return;

  //Create pointer that will point to list that we want to add to
  LinkedList<TreeNode> list = null;

  //We don't have a linked list for this level; if this were true, lists.size() would equal level + 1
  if(lists.size() == level){
    //Intialize new list
    list = new LinkedList<TreeNode>();
    //Add new list to master list of lists
    list.add(list);
  }else{
    list = lists.get(level);
  }
  //Determined list to add to, so add
  list.add(root);

  //Recursive calls: Update level to level + 1
  buildLists(root.left, lists, level + 1);
  buildLists(root.right, lists, level + 1);
}

//Calling method that initalizes paramters
ArrayList<LinkedList<TreeNode>> buildLists(TreeNode root){
  //Inialize master list
  ArrayList<LinkedList<TreeNode>> lists = new ArrayList<LinkedList<TreeNode>>();
  //Make recursive call with level initially 0
  buildLists(root, lists, 0);
  //Return completed master list
  return lists;
}
