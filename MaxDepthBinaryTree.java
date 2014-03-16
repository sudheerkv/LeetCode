/**
 * Definition for binary tree public class TreeNode { int val; TreeNode left;
 * TreeNode right; TreeNode(int x) { val = x; } }
 */
public class Solution {
	public int max(int a, int b) {
		return a >= b ? a : b;
	}

	public int maxDepth(TreeNode root) {

		if (root == null) {
			return 0;
		} else {
			int depth1 = maxDepth(root.left);
			int depth2 = maxDepth(root.right);
			int depth = max(depth1, depth2);
			return depth + 1;
		}

	}
}