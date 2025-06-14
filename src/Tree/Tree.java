package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {

    TreeNode root;

    public void newRoot(int key) {
        TreeNode node = new TreeNode(key);
        root = node;
        node.left = null;
        node.right = null;
    }

    public int maxValue(TreeNode Root) {
        if (Root == null)
            return Integer.MIN_VALUE;
        return Math.max(Root.key, Math.max(maxValue(Root.left), maxValue(Root.right)));
    }

    public int size(TreeNode Root) {
        if (Root == null)
            return 0;
        return size(Root.left) + size(Root.right) + 1;
    }

    public int height(TreeNode Root) {
        if (Root == null) {
            return 0;
        }
        return Math.max(height(Root.left), height(Root.right)) + 1;
    }

    public boolean balancedRoot(TreeNode Root) {
        return (Math.abs(height(Root.left) - height(Root.right)) <= 1);
    }

    public boolean childrenSum(TreeNode Root) {
        int sum = 0;
        if (Root == null)
            return true;
        if (Root.left != null)
            sum += Root.left.key;
        if (Root.right != null)
            sum += Root.right.key;
        return (Root.key == sum && childrenSum(Root.left) && childrenSum(Root.right));
    }

    public void displayInorder(TreeNode root) {
        if (root != null) {
            displayInorder(root.left);
            System.out.print(root.key + " ");
            displayInorder(root.right);
        }
    }

    public void displayLevelOrder(TreeNode Root) {
        if (root == null)
            return;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode cur = q.poll();
                System.out.print(cur.key + " ");
                if (cur.left != null)
                    q.offer(cur.left);
                if (cur.right != null)
                    q.offer(cur.right);
            }
            System.out.println();
        }
    }

    public void displayKth(TreeNode Root, int k) {
        if (Root == null)
            return;
        if (k == 0)
            System.out.println(Root.key + " ");
        else {
            displayKth(Root.left, k - 1);
            displayKth(Root.right, k - 1);
        }
    }

    public boolean searchBST(TreeNode Root, int num) {
        if (Root == null)
            return false;
        if (Root.key == num)
            return true;
        if (Root.key < num)
            return searchBST(Root.right, num);
        else
            return searchBST(Root.left, num);
    }

    public void insertBST(TreeNode Root, int num) {
        if (Root == null) {
            newRoot(num);
            return;
        }
        if (Root.key == num) {
            return;
        }
        if (Root.left == null && Root.key < num) {
            Root.left = new TreeNode(num);
        }
        if (Root.right == null && Root.key > num) {
            Root.right = new TreeNode(num);
        }
        if (Root.key > num)
            insertBST(Root.right, num);
        else
            insertBST(Root.left, num);
    }

    public int floorBST(TreeNode Root, int num) {
        int n = 0;
        while (Root != null) {
            if (Root.key == num)
                return num;
            if (Root.key > num)
                Root = Root.left;
            else {
                n = Root.key;
                Root = Root.right;
            }
        }
        return n;
    }

    public int ceilBST(TreeNode Root, int num) {
        int n = -1;
        while (Root != null) {
            if (Root.key == num)
                return num;
            if (Root.key < num)
                Root = Root.right;
            else {
                n = Root.key;
                Root = Root.left;
            }
        }
        return n;
    }

    public void invertBST(TreeNode Root) {
        if (Root == null)
            return;
        TreeNode temp;
        temp = Root.right;
        Root.right = Root.left;
        Root.left = temp;
        invertBST(Root.left);
        invertBST(Root.right);
    }
}
