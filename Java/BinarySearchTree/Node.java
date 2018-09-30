package BinarySearchTree;
public class Node<T extends Comparable<T>>{
    
    private T data;
    private Node<T> left;
    private Node<T> right;
    
    public Node(T data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
    
    @Override
    public String toString(){
        return this.data.toString();
    }

    public Node<T> getLeftChild(){
        return this.left;
    } 
    
    public Node<T> getRightChild(){
        return this.right;
    }
    
    public void setLeftChild(Node<T> left){
        this.left = left;
    }
    
    public void setRightChild(Node<T> right){
        this.right = right;
    }
    public T getData(){
        return data;
    }
}