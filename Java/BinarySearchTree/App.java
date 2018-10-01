package BinarySearchTree;
public class App{
    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>();
        bst.insert(112121210);
        bst.insert(-13);
        bst.insert(121212);
        bst.insert(-14);
        bst.traversal();
        System.out.println(bst.getMin());
        System.out.println(bst.getMax());

    }
}