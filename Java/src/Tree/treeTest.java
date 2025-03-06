package Tree;

public class treeTest {
    public static void main(String[] args) {
        Tree tree=new Tree();
        tree.newRoot(15);
        tree.insertBST(tree.root,5);
        tree.insertBST(tree.root,3);
        tree.insertBST(tree.root,30);
        tree.insertBST(tree.root,18);
        tree.insertBST(tree.root,19);
        tree.insertBST(tree.root,80);
        tree.invertBST(tree.root);
        tree.displayLevelOrder(tree.root);
    }
}
