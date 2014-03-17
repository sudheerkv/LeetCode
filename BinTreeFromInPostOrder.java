/**
 * Definition for binary tree public class TreeNode { int val; TreeNode left;
 * TreeNode right; TreeNode(int x) { val = x; } }
 */
public class Solution {
	public TreeNode buildTree(int[] inorder, int[] postorder) {

		int n = postorder.length - 1;
		int i = 0;
		if (n < 0)
			return null;
		TreeNode root = new TreeNode(postorder[n]);
		if (n == 0)
			return root;
		for (i = 0; i < n; i++)
			if (inorder[i] == postorder[n]) {
				break;
			}
		int[] left_inorder = Arrays.copyOfRange(inorder, 0, i);
		int[] left_postorder = Arrays.copyOfRange(postorder, 0, i);
		root.left = buildTree(left_inorder, left_postorder);
		if (i != n) {
			int[] right_inorder = Arrays.copyOfRange(inorder, i + 1, n);
			int[] right_postorder = Arrays.copyOfRange(postorder, i, n);
			root.right = buildTree(right_inorder, right_postorder);
		}
		return root;

	}
}