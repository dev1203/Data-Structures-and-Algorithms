package LinkedList;

/*
    - This is the inerface which will add the supertype
    - which will have all the methods to implements. Will add the 
    - Concerete behaviours
*/
public interface List<T> {
    public void insert(T data);
    public void remove(T data);
    public void traverseList();
    public int size();
}