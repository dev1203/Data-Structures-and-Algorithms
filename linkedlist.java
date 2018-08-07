/*
    - This is an implementation of linked list with int.
    - Methods: 
    - insert(data) : will insert at the front;
    - insertAtEnd(data) : will insert at the end;
    - remove() : will remove at the front 
    - traverse() : will traverse the whole linked list
    - getSize() : will return the size
*/
public class linkedlist{
    Node root;
    private int size;

    public void insert(int data){
        if(root == null){
            root = new Node(data);
        }
        else{
            Node temp = new Node(data);
            temp.next = root;
            root = temp;
        }
        size++;
    }
    public void insertAtEnd(int data){
        if(root == null){
            root = new Node(data);
        }
        else{
            Node temp = root;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = new Node(data);
        }
        size++;
    }
    public void remove(){
        if(root == null){
            return ;
        }
        else if(this.size==1){
            root = null;
        }
        else{
            root = root.next;
        }
    }
    public void traverse(){
        Node temp = root;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }
    public int getSize(){
        return size;
    }
    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        list.insert(10);
        list.insertAtEnd(100);
        list.insertAtEnd(50);
        list.traverse();
        System.out.println();
        list.traverse();

    }
}
/*
    - This is the Node class which is used to contruct the linked list
    - Methods:
    - Constructor : will take a int and add it to the given node
    - data : data stored in the node 
    - next : The address of the next Node.

*/
class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }
}