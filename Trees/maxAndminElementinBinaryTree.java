class Solution{
    public static int findMax(Node root){
        //code here
        if(root == null){
            return Integer.MIN_VALUE;
        }
        
        int lM = findMax(root.left);
        int rM = findMax(root.right);
        int max = Math.max(lM, rM);
        int finalMax = Math.max(root.data, max);
        return finalMax;
    }
    public static int findMin(Node root){
        //code here
        if(root == null){
            return Integer.MAX_VALUE;
        }
        int lM = findMin(root.left);
        int rM = findMin(root.right);
        int min = Math.min(lM, rM);
        int finalMin = Math.min(root.data, min);
        return finalMin;        
    }
}
