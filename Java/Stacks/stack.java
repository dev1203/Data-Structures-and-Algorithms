public class stack <T extends Comparable<T>> {
    private Node<T> root;
    private int size;

    public void push(T data){
        if(this.root == null){
            root = new Node<>(data);
        }
        else{
            Node <T> temp = new Node<>(data);
            temp.setNextNode(root);
            root = temp;
        }
        size++;
    }

    public T pop(){
       T itemToPop = root.getData();
       root = root.getNextNode();
       size--;
       return itemToPop;
    }

    public boolean isEmpty(){
        return root == null;
    }
    
    public int getSize(){
        return this.size;
    }

}