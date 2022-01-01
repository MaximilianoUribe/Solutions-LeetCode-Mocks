/*
Return the maximun depth of a binary tree.

My solutin merely consist on returning the maximum number of levels comparing
the right and left subtree.
*/


/*
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */


class Problem104 {
	public int maxDepth(TreeNode root) {
		if(root == null) return 0;

		return 1 + Math.max(maxDepth(root.right), maxDepth(root.left));

	}
}