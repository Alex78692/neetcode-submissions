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
    boolean t  =  false;
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
                if(subRoot==null){
                      return true ;
                }
                if( root==null){
                      return false;
                }
                check(root  ,  subRoot);
                return t;
    }


   void  check(TreeNode  root  ,   TreeNode   subRoot){
           if(root==null){
               return  ;
           }
           if(root.val==subRoot.val){
           if(sub(root  ,  subRoot)){
               t  =  true;
               return ;
           };
           }
           check(root.left ,   subRoot);
           check(root.right  ,  subRoot);

    }
    boolean sub(TreeNode root ,   TreeNode subRoot){
            if(root==null && subRoot==null){
                   return true;
            }
              if (root==null  || subRoot==null ){
                   return false ;
            }
            if(root.val!=subRoot.val){
                  return false ;
            }
            return sub(root.left  , subRoot.left)&&
                   sub(root.right ,  subRoot.right);
    }
}
