package Tree;

public class treeTest {
    public static void main(String[] args) {
        Tree tree=new Tree();
        tree.newRoot(15);
        tree.root.left = new Node(5);
        tree.root.left.left = new Node(3);
        tree.root.right= new Node(30);
        tree.root.right.left= new Node(18);
        tree.root.right.right= new Node(50);

        tree.insertBST(tree.root,80);
        System.out.println(tree.ceilBST(tree.root, 14));
    }
}