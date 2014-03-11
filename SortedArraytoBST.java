/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode sortedArrayToBST(int[] num) {
        TreeNode root = ArrayToBST(num,0, num.length-1);
        return root;
    }
      public TreeNode ArrayToBST(int[] num, int low, int high) {
    	int mid= (low+high)/2;
    	if(low>high)
    		return null;
    	TreeNode root = new TreeNode(num[mid]);
    	
    	root.left =ArrayToBST(num,low,mid-1);
    	root.right =ArrayToBST(num,mid+1,high);
    	
    	return root;
    }
}