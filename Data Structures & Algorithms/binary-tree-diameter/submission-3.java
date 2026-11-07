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
    int max  =  Integer.MIN_VALUE;
    public int diameterOfBinaryTree(TreeNode root) {
             if(root==null){
                   return  0 ;
             }   
            int k= dia(root);
            return max;
    }
      
    int dia(TreeNode root){
           if(root==null){
               return  0 ;
           }
         int left  =  dia(root.left);
          int rigth  =  dia(root.right);
        //   int m  =  Math.max(left ,rigth);
          
           max  =  Math.max(max , left+rigth);
          return 1+Math.max(left,  rigth) ; 
          
    }
}
