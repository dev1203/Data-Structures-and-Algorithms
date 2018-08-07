package LinkedList;
/*
    - Implements means that this class is going to implement
    - all the methods described in the List interface
*/
public class LinkedList<T extends Comparable<T>> implements List<T>{
    private Node<T> root;
    private int sizeOfList;

    @Override
    public void insert(T data){
        this.sizeOfList++;
        if(root == null){
            this.root = new Node<>(data);
        }
        else{
           insertAtBeginning(data);
        }
    }

    private void insertAtBeginning(T data){
        Node<T> newNode = new Node<>(data);
        newNode.setNextNode(root);
        root = newNode;
    }

    private void insertAtEnd(T data){
        Node<T> temp = this.root;
        while(temp.getNextNode()!=null){
            temp = temp.getNextNode();
        }
        temp.setNextNode(new Node<>(data));
    }

    @Override
    public void remove(T data){
        if(this.root == null){
            return;
        }
        else{
            this.sizeOfList --;
        }
    }

    @Override
    public void traverseList(){
        if(this.root == null ){
            return;
        }
        Node<T> temp = this.root;
        while(temp != null){
            System.out.println(temp);
            temp = temp.getNextNode();
        }
    }
    @Override
    public int size(){
        return this.sizeOfList;
    }
}