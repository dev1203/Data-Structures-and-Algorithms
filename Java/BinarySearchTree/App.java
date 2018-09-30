package BinarySearchTree;
public class App{
    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>();
        bst.insert(10);
        bst.insert(-13);
        bst.insert(12);
        bst.traversal();
    }
}