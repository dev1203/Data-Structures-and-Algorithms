package BinarySearchTree;
public interface Tree<T extends Comparable<T>>{
    public void traversal();
    public void insertNode(T newdata,Node<T> currentNode);
    public void delete(T data);
    public T getMax();
    public T getMin();
}