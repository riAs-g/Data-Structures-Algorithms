package Tree;

import java.util.ArrayList;
import java.util.List;

public class TreePaths {

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.newRoot(1);
        tree.insertBST(tree.root, 2);
        tree.insertBST(tree.root, 5);
        tree.insertBST(tree.root, 3);
        System.out.println(binaryTreePaths(tree.root));
    }

    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        StringBuilder sb = new StringBuilder();
        dfs(root, res, sb);
        return res;
    }

    private static void dfs(TreeNode root, List<String> res, StringBuilder sb) {
        if (root.left == null && root.right == null) {
            sb.append("" + root.key);
            res.add(sb.toString());
            return;
        }
        if (root.left != null) {
            String prev = sb.toString();
            sb.append(root.key + "->");
            dfs(root.left, res, sb);
            sb = new StringBuilder(prev);
        }
        if (root.right != null) {
            sb.append(root.key + "->");
            dfs(root.right, res, sb);
        }
    }
}
