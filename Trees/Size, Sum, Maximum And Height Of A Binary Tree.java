class Solution {
    public int sizeOfTree(Node root) {
        if(root == null){
            return 0;
        }
        int ls = sizeOfTree(root.left);
        int rs = sizeOfTree(root.right);
        int size = ls + rs + 1;
        return size;
    }

    public int sumOfTree(Node root) {
        if(root == null){
            return 0;
        }
        int lSum = sumOfTree(root.left);
        int rSum = sumOfTree(root.right);
        int sum = lSum + rSum + root.data;
        return sum;
    }

    public int maxOfTree(Node root) {
        if(root == null){
            return Integer.MIN_VALUE;
        }
        int lmax = maxOfTree(root.left);
        int rmax = maxOfTree(root.right);
        int max = Math.max(lmax, rmax);
        int finalMax = Math.max(root.data, max);
        return finalMax;
    }

    public int heightOfTree(Node root) {
        int height = calculateHeight(root);
        return height;
    }
    public int calculateHeight(Node root){
        if(root == null){
            return 0;
        }
        int lH = calculateHeight(root.left);
        int rH = calculateHeight(root.right);
        int height = Math.max(lH, rH) + 1;
        return height;
    }
}
