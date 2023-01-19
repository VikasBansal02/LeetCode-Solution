// 110. Balanced Binary Tree


public class Balanced_Binary_Tree
{
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
	
}

// Solution in O(n²)

class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        boolean left = isBalanced(root.left);
        boolean right = isBalanced(root.right);
        boolean isbal = Math.abs(ht(root.left) - ht(root.right)) <=1;
        return left && right && isbal;
    }
    
    public int ht(TreeNode root){
        if(root==null){
            return -1;
        }
        int lh = ht(root.left);
        int rh = ht(root.right);
        
        return Math.max(lh,rh) + 1;
    }
}

// Solution in O(n)

class BalPair {
		boolean isbal = true;
		int ht = -1;
	}

	class Solution {
		public boolean isBalanced(TreeNode root) {
			return IsBalanced(root).isbal;

		}

		public BalPair IsBalanced(TreeNode node) {
			if (node == null) {
				return new BalPair();
			}

			BalPair lbp = IsBalanced(node.left);
			BalPair rbp = IsBalanced(node.right);
			BalPair sbp = new BalPair();
			sbp.ht = Math.max(lbp.ht, rbp.ht) + 1;
			boolean sb = Math.abs(lbp.ht - rbp.ht) <= 1;
			sbp.isbal = lbp.isbal && rbp.isbal && sb;
			return sbp;

		}
	}
