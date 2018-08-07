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
        this.sizeOfList--;
        if(this.root == null){
            return;
        }
        else if(root.getData().compareTo(data)==0){
            root = root.getNextNode();
        }
        else{
            remove(data, this.root.getNextNode(), this.root);
        }
    }

    private void remove(T data, Node<T> current, Node<T> previous){
        while(current !=null){
            if(current.getData().compareTo(data)==0){
                previous.setNextNode(current.getNextNode());
                current = null;
                return;
            }
            else{
                previous = current;
                current = current.getNextNode();
            }
        }
    }

    @Override
    public void traverseList(){
        if(this.root == null ){
            return;
        }
        Node<T> temp = this.root;
        while(temp != null){
            System.out.print(temp+"->");
            temp = temp.getNextNode();
        }
    }
    @Override
    public int size(){
        return this.sizeOfList;
    }
}