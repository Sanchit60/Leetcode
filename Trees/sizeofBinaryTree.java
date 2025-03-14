class Solution {
    public static int getSize(Node node) {
        // code here
        if(node == null){
            return 0;
        }
        int ls = getSize(node.left);
        int rs = getSize(node.right);
        int size = ls + rs + 1;
        return size;
    }
}
