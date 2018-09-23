public class app<T extends Comparable<T>>{
    public static void main(String []args){
        stack<Integer> s= new stack<Integer>();
        s.push(1);
        s.push(10);
        s.push(2);
        s.push(5);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }  
}