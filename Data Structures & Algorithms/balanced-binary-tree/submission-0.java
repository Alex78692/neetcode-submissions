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
      
         int dia(TreeNode root){
               if(root==null){
                return  0 ;
               }
            int    l = dia(root.left);
            int    r  =  dia(root.right);
               return 1+Math.max(l,  r);
         }
        boolean bal(TreeNode root){
               if(root==null){
                 return true ;
               }
               int  l = dia(root.left);
               int r  = dia(root.right);
                 
  
               if(Math.abs(l-r)>1 ){
                 return   false ; 
               }
             return  bal(root.left)&&
               bal(root.right);

        }
    public boolean isBalanced(TreeNode root) {
            //    boolean  t =  true;
                return bal(root); 
               

    }
}
