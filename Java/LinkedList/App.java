package LinkedList;
/*
    - This is a drive class of the linkedlist package
    - Methods that can be used
    - insert(data)- Insert at the beggining
    - remove(data)- Remove the data from the linked list
    - traverseList()- Traverse the linkedlist
    - size() - will return the size of the linked list

*/
public class App{
    public static void main(String []args){
        List<Integer> list = new LinkedList<Integer>();

        list.insert(10);
        list.insert(11);
        list.insert(12);
        list.traverseList();
    }
}