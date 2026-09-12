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
    List<List<Integer>> list  =  new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
               if(root==null){
                   return list;
               }
               Queue<TreeNode>  q =  new LinkedList<>();
               q.add(root);
               while(!q.isEmpty()){
                    List<Integer>  l =  new ArrayList<>();
                     int s = q.size();
                    for(int i = 0 ; i<s ; i++){
                         TreeNode c =q.remove();
                          l.add(c.val);
                     
                     if(c.left!=null){
                        q.add(c.left);
                     } 
                     if(c.right!=null){
                         q.add(c.right);
                     }
                    }
                     list.add(l);
   
               }

   return list;

    }
}
