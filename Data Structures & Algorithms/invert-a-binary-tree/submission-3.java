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
    public TreeNode invertTree(TreeNode root) {
            if(root==null){
                   return null;
            }
            
          return   invert(root);

        
    }

    TreeNode invert(TreeNode  root){
              if(root ==null){
                   return null;
              }
         
            TreeNode left  =  invert(root.left);
            TreeNode right  =  invert(root.right);
            //   TreeNode temp  =  left ;
              root.left  =  right ;
              root.right  =  left;
              return root;

            

    }
}
