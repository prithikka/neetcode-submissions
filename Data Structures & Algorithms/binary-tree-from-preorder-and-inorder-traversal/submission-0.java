/**
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

class Solution {
    int pre=0;
    public TreeNode build(int[] preorder,int[] inorder,int start,int end){
        if(start>end)
            return null;
        
        int x=preorder[pre++];
        TreeNode root=new TreeNode(x);
        int i=start;
        while(inorder[i]!=x){
            i=i+1;
        }
        root.left=build(preorder,inorder,start,i-1);
        root.right=build(preorder,inorder,i+1,end);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder,inorder,0,inorder.length-1);
    }
}
