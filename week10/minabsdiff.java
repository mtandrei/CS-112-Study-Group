//Solution adapted from leetcode.com
public class Solution {
    int min = Integer.MAX_VALUE;
    Integer prev = null;
    
    //Inorder traversal modified to find mins (with prev node)
    public int getMinimumDifference(TreeNode root) {
        if (root == null) return min;
        
	//Branch left
        getMinimumDifference(root.left);
        
        if (prev != null) {
	    //Check root
            min = Math.min(min, root.val - prev);
        }
        prev = root.val;
        
	//Branch right
        getMinimumDifference(root.right);
        
        return min;
    }
    
}
