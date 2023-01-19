class Solution {
    public boolean isSymmetric(TreeNode root) {
        return Symmetric(root,root);
    }
    
    private boolean Symmetric(TreeNode node1, TreeNode node2){
        if(node1==null && node2==null){
            return true;
        }
        if(node1==null || node2==null){
            return false;
        }
        if(node1.val!=node2.val){
            return false;
        }
        boolean left = Symmetric(node1.left,node2.right);
        boolean right = Symmetric(node1.right,node2.left);
				// Note for Two Tree Comparison
				// boolean left = Symmetric(node1.left,node2.right);
        // boolean right = Symmetric(node1.right,node2.left);
				// Note for Structure Comparison don't write value Comparison
				
        return left && right;
        
    }
}
