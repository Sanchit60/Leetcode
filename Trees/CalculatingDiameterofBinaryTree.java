class Solution {
    int maxDia = Integer.MIN_VALUE;
    public int diameterOfBinaryTree(TreeNode root) {
        int h = height(root);
        return maxDia;

    }
    public int height(TreeNode root){
        if(root == null){
            return -1;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        maxDia = Math.max(maxDia, lh + rh + 2);
        return Math.max(lh, rh) + 1;
    }
    // public int calculateDia(TreeNode root){
    //     int lh = height(root.left);
    //     int rh = height(root.right);
    //     int leftDia = calculateDia(root.left);
    //     int rightDia = calculateDia(root.right);
    //     int myDia = lh + rh + 2;
    //     return Math.max(myDia, Math.max(leftDia, rightDia));
    // }    
}
