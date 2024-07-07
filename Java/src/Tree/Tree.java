package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Tree{

    Node root;

    public void newRoot(int key){
         Node node=new Node(key);
         root=node;
         node.left=null;
         node.right=null;
    }

    public int maxValue(Node Root){
        if (Root == null)
            return Integer.MIN_VALUE;
        return Math.max(Root.key, Math.max(maxValue(Root.left), maxValue(Root.right)));
    }

    public int size(Node Root){
        if (Root == null)
            return 0;
        return size(Root.left)+size(Root.right)+1;
    }

    public int height(Node Root){
        if (Root == null){
            return 0;
        }
        return Math.max(height(Root.left),height(Root.right))+1;
    }

    public boolean balanced(Node Root){
        return (Math.abs(height(Root.left)-height(Root.right)) <= 1);
    }

    public boolean childrenSum(Node Root){
        int sum=0;
        if (Root == null)
            return true;
        if (Root.left != null)
            sum+= Root.left.key;
        if (Root.right != null)
            sum+= Root.right.key;
        return  (Root.key == sum && childrenSum(Root.left) && childrenSum(Root.right));
    }

    public void displayInorder(Node root){
        if (root != null){
            displayInorder(root.left);
            System.out.println(root.key);
            displayInorder(root.right);
        }
    }

    public void displayKth(Node Root, int k){
        if (Root == null)
            return;
        if (k == 0)
            System.out.println(Root.key+" ");
        else {
            displayKth(Root.left, k-1);
            displayKth(Root.right, k-1);
        }
    }

    public void levelOrder(Node Root){
        Queue<Node> q = new LinkedList<>();
        q.add(Root);
        while (!q.isEmpty()){
            Node curr=q.poll();
            System.out.println(curr.key);
            if (curr.left!=null)
                q.add(curr.left);
            if (curr.right!=null)
                q.add(curr.right);
        }
    }

    public boolean searchBST(Node Root, int num){
        if (Root == null)
            return false;
        if (Root.key == num)
            return true;
        if (Root.key < num)
            return searchBST(Root.right, num);
        else
            return searchBST(Root.left, num);
    }

    public void insertBST(Node Root, int num){
        if (Root == null){
            newRoot(num);
            return;
        }
        if (Root.key == num){
            return;
        }
        if (Root.left == null && Root.key > num){
            Root.left = new Node(num);
        }
        if (Root.right == null && Root.key < num){
            Root.right = new Node(num);
        }
        if (Root.key < num)
            insertBST(Root.right, num);
        else
            insertBST(Root.left, num);
    }

    public int floorBST(Node Root, int num){
        int n=0;
        while (Root != null){
            if (Root.key == num)
                return num;
            if (Root.key > num)
                Root= Root.left;
            else {
                n = Root.key;
                Root = Root.right;
            }
        }
        return n;
    }

    public int ceilBST(Node Root, int num){
        int n=-1;
        while (Root != null){
            if (Root.key == num)
                return num;
            if (Root.key < num)
                Root= Root.right;
            else {
                n = Root.key;
                Root = Root.left;
            }
        }
        return n;
    }
}