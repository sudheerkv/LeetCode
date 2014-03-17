/**
 * Definition for binary tree public class TreeNode { int val; TreeNode left;
 * TreeNode right; TreeNode(int x) { val = x; } }
 */
public class Solution {
	public int min(int a, int b) {
		if (a == 0)
			return b;
		else if (b == 0)
			return a;
		else
			return a <= b ? a : b;
	}

	public int minDepth(TreeNode root) {

		if (root == null) {
			return 0;
		} else {
			int depth1 = minDepth(root.left);
			int depth2 = minDepth(root.right);
			int depth = min(depth1, depth2);
			return depth + 1;
		}

	}
}