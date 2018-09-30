package BinarySearchTree;
public class BinarySearchTree<T extends Comparable<T>> implements Tree<T>{
    private Node<T> root;
    @Override
    public void traversal(){
        if (root!=null){
            traverseInOrder(root);
        }
        System.out.println();
    }
    public void traverseInOrder(Node<T> node){
        if(node.getLeftChild() != null){
        traverseInOrder(node.getLeftChild());
        }
        System.out.print(node+" -->");
        if(node.getRightChild() != null){
            traverseInOrder(node.getRightChild());
        }
    }
    /*
        - Helper method takes data  
        - and then call insertNode if root not null
        - @return null
    */
    public void insert(T data){
        if(root == null){
            root = new Node<T>(data);
        } else{
            insertNode(data, root);
        }
    }
    /*
        - Insert Method takes two argument
        - first data to be inserted and second the currentNode in recurion
        - @retuns null
    */
    @Override
    public void insertNode(T newdata,Node<T> currentNode){
        if(newdata.compareTo(currentNode.getData()) < 0){
            // Smaller that means insert at right
            if(currentNode.getLeftChild() != null){
                insertNode(newdata, currentNode.getLeftChild());
            } else{
                Node<T> newNode = new Node<T>(newdata);
                currentNode.setLeftChild(newNode);
            }
        } else{
            if(currentNode.getRightChild() != null){
                insertNode(newdata, currentNode.getRightChild());
            } else{
                Node<T> newNode = new Node<T>(newdata);
                currentNode.setRightChild(newNode);
            }
        }
    }
    @Override
    public void delete(T data){

    }
    @Override
    public T getMax(){
        return null;
    }
    @Override
    public T getMin(){
        return null;
    }
}