class Solution {
    public int maxDepth(TreeNode root) {
        int height = calculateheight(root);
        return height;        
    }
    public int calculateheight(TreeNode root){
        if(root == null){
            return 0;
        }
        int lh = calculateheight(root.left);
        int rh = calculateheight(root.right);
        int height = Math.max(lh, rh) + 1;
        return height;
    }
}
