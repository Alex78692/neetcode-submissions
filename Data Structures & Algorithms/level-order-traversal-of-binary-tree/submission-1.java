class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> level = new ArrayList<>();

        if(root == null){
            return level;
        }

        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        while(!q.isEmpty()){

            List<Integer> list = new ArrayList<>();

            int size = q.size();

            for(int i = 0; i < size; i++){

                TreeNode t = q.remove();

                list.add(t.val);

                if(t.left != null){
                    q.add(t.left);
                }

                if(t.right != null){
                    q.add(t.right);
                }
            }

            level.add(list);
        }

        return level;
    }
}