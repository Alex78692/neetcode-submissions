class Solution {

    TreeNode lca(TreeNode root, TreeNode p, TreeNode q) {

        if (root == null) {
            return null;
        }

        if (root == p || root == q) {
            return root;
        }

        TreeNode l = lca(root.left, p, q);
        TreeNode r = lca(root.right, p, q);

        // p and q found in different subtrees
        if (l != null && r != null) {
            return root;
        }

        // Found in left subtree
        if (l != null) {
            return l;
        }

        // Found in right subtree
        return r;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return lca(root, p, q);
    }
}
