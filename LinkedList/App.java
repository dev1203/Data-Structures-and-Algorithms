package LinkedList;
public class App{
    public static void main(String []args){
        List<Integer> list = new LinkedList<Integer>();

        list.insert(10);
        list.insert(11);
        list.insert(12);
        list.traverseList();
        list.remove(1);
        System.out.println();
        list.traverseList();

    }
}