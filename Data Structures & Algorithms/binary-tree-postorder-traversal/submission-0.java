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
    public List<Integer> postorderTraversal(TreeNode root) {
         if(root==null){
               return new ArrayList<>();

         }
        List<Integer>   list  =  new ArrayList<>();
          postOrderTrans( root ,  list);
          return list;

            
    
        
    }
     void postOrderTrans(TreeNode  root ,  List<Integer> list){

            if(root==null){
                   return ; 

            }
            postOrderTrans(root.left , list );
            postOrderTrans(root.right ,  list);
            list.add(root.val);
        }
}