//Approach - 1
class Solution {
    public TreeNode createTree(int[] pre, int[] in, int psi, int pei, int isi, int iei){
        if(psi > pei){
            return null;
        }
        if(psi == pei && isi == iei){
            return new TreeNode(pre[psi]);
        }
        TreeNode root = new TreeNode(pre[psi]);
        int idx = -1;
        for(int i = isi; i <= iei; i++){
            if(in[i] == pre[psi]){
                idx = i;
                break;
            }
        }
        int lc = idx - isi;
        int lisi = isi;
        int liei = idx - 1;
        int lpsi = psi + 1;
        int lpei = psi + lc;
        int risi = idx + 1;
        int riei = iei;
        int rpsi = lpei + 1;
        int rpei = pei;

        root.left = createTree(pre, in, lpsi, lpei, lisi, liei);
        root.right = createTree(pre, in, rpsi, rpei, risi, riei);
        return root;
    }
    public TreeNode buildTree(int[] pre, int[] in) {
        int n = pre.length;
        TreeNode root = createTree(pre, in, 0, n-1, 0, n-1);
        return root;
        
    }
}
