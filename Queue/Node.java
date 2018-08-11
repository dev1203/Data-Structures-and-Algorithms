/*
- <T> means the Generic type which can take multiple data types
- like String, int , double and custom object as well, so that we don't have to repeat the code
- or class for every single datatype
*/
public class Node<T extends Comparable<T>>{

    private T data;
    private Node<T> nextNode;

    public Node(T data){
        this.data = data;
    }
    public T getData(){
        return data;
    }
    public void setData(T data){
        this.data = data;
    }
    public Node<T> getNextNode(){
        return nextNode;
    }
    public void setNextNode(Node<T> nextNode){
        this.nextNode = nextNode;
    }
    /*
    - Override means that this will override the toString property of the 
    - Subclass or superclass which can be used to modify methods to spectific
    - Class.
    */
     @Override
     public String toString(){
         return this.data.toString();
     }

}


