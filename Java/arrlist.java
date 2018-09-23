import java.util.ArrayList;

public class arrlist{
    public static void main(String []args){
        ArrayList <String> list = new ArrayList<>();
        list.add("Dev");
        list.add("dsa");
        list.add("asd");
        list.add("assd");
        list.remove(0);
        for(String s: list)
            System.out.println(s);

    }
}