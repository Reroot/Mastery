package BinaryTrees;

import java.util.Stack;

public class binarySTreeValidate {
	
	public static boolean validateBST(TreeNode root) {
	    return validateBSTX(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	public boolean isValidBST(TreeNode root) {
		   if (root == null) return true;
		   Stack<TreeNode> stack = new Stack<>();
		   TreeNode pre = null;
		   while (root != null || !stack.isEmpty()) {
		      while (root != null) {
		         stack.push(root);
		         root = root.left;
		      }
		      root = stack.pop();
		      if(pre != null && root.val <= pre.val) return false;
		      pre = root;
		      root = root.right;
		   }
		   return true;
		}

	public static boolean validateBSTX(TreeNode root, int min, int max) {
	    if(root == null) {
	        return true;
	    }
	    if(root.val < min || max < root.val) {
	        return false;
	    }
	    return validateBSTX(root.left, min, root.val) && validateBSTX(root.right, root.val, max);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
