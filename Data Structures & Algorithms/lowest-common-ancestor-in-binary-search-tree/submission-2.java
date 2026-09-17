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
    //    boolean left  = false  ; 
    //    boolean right= false;
           void  check(TreeNode root , TreeNode p ,TreeNode  q ,Boolean t ){
                       if(root==null){
                        return ;
                       }
                    if(root==p ||  root ==q){
                    t = true ;
                    }
                    check(root.left , p ,  q ,t );
                    check(root.right , p ,  q , t );

                  
           }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
                  if(root==null){
                    return null;
                  }
                  if(root==p ||   root==q){
                        return root;
                  }
                  
                //   if((root==p || root == q ) && root){
                //          return root;
                //   }
                //   check(root.left ,  p , q ,  right);
                //   check(root.right , p ,  q , left);
                
                  TreeNode left =  lowestCommonAncestor(root.left,p ,q);
                  
                  TreeNode right = lowestCommonAncestor(root.right,p ,q);
                
                  if(left!=null && right!=null){
                           return root;
                  }
                
                //   if(left==false && right==true){
                    return left==null? right:left;
                  

    }
}
