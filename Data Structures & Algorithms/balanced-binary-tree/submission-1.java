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
    public boolean isBalanced(TreeNode root) {
                return checkBal(root);
    }

     boolean checkBal(TreeNode root){
            if(root==null){
                   return  true ; 
            }
            int left  =dia(root.left);
            int right  =dia(root.right);
            if(Math.abs(left-right)>1){
                   return false;
            }
            
            return checkBal(root.left)&&checkBal(root.right); 

     
     }
     int dia(TreeNode root){
          if(root==null){
               return 0 ; 

          }
          int left = 1+dia(root.left);
          int right  = 1+dia(root.right);
          return Math.max(left, right);
     }
}
