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
         void invert(TreeNode root1  , TreeNode root2){
                 if(root1==null && root2==null){
                    return ;
                 }
                //  else if(root1)
                 TreeNode head = root1.left;
                 root1.left = root2.right;
                 root2.right = head;
                 invert(root1.left ,  root2.right);
                 invert(root1.right , root2.left);
         }
    public TreeNode invertTree(TreeNode root) {
                  if(root==null){
                    return root;
                  }
                  TreeNode  temp  =  root.left;
                  root.left =  root.right;
                  root.right =  temp;
                  invertTree(root.left);
                  invertTree(root.right);
                  return root;
    }
}
