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
    public List<Integer> inorderTraversal(TreeNode root) {
                 if(root ==null){
                       return new ArrayList<>();
                 }
                  List<Integer> list  =  new ArrayList<Integer>();
                inOrderTranversal( root , list);
                return list;


    }
    void inOrderTranversal(TreeNode root , List<Integer> list){
                  if(root==null){
                       return; 
                  }
                  inOrderTranversal(root.left,list);
                  list.add(root.val);
                  inOrderTranversal(root.right , list);
    }
}