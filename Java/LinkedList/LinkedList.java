package LinkedList;
/*
    - Implements means that this class is going to implement
    - all the methods described in the List interface
*/
public class LinkedList<T extends Comparable<T>> implements List<T>{
    private Node<T> root;
    private int sizeOfList;

/*
    - insert method will take a data and it will always insert in the
    - front of the linked list

*/
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

/*
    - This is a helper method that will be user to insert in the beginning
    - Time complexity O(1)
*/

    private void insertAtBeginning(T data){
        Node<T> newNode = new Node<>(data);
        newNode.setNextNode(root);
        root = newNode;
    }

/*
    - This is a helper method that will be user to insert at the end
    - Time complexity O(n)
*/

    private void insertAtEnd(T data){
        Node<T> temp = this.root;
        while(temp.getNextNode()!=null){
            temp = temp.getNextNode();
        }
        temp.setNextNode(new Node<>(data));
    }

/*
    - This method will remove a gicen element in the linked list,
    - it uses a helper method remove that will traverse the whole linkedlist
    - to find the element to remove
*/

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

/*
    - This is a helper method that will be used to remove an element 
    - Time complexity O(n)
*/

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

/*
    - This method will traverese the whole linked list
*/
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

/*
    - This is a helper method will return the size of the linked list
*/

    @Override
    public int size(){
        return this.sizeOfList;
    }
}