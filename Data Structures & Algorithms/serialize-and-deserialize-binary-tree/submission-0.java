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

public class Codec {

    String s = "";
    int index = 0;

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        s = "";
        seria(root);
        return s;
    }

    public void seria(TreeNode root) {

        if (root == null) {
            s += "null ";
            return;
        }

        s += root.val + " ";

        seria(root.left);
        seria(root.right);
    }

    // Decodes your encoded data to tree.
    TreeNode des(String[] arr) {

        if (index >= arr.length) {
            return null;
        }

        if (arr[index].equals("null")) {
            index++;
            return null;
        }

        TreeNode temp = new TreeNode(Integer.parseInt(arr[index]));

        index++;

        temp.left = des(arr);
        temp.right = des(arr);

        return temp;
    }

    public TreeNode deserialize(String data) {

        String[] arr = data.split(" ");

        index = 0;

        return des(arr);
    }
}
