/*
- This is the driver class for the Queue
*/
public class app<T extends Comparable<T>>{
	public static void main(String args[]){
		Queue<Integer> q = new Queue<Integer>();

		q.enqueue(10);
		q.enqueue(11);
		q.enqueue(12);
		q.enqueue(13);

		while(!q.isEmpty()){
			System.out.print(q.dequeue()+"->");
		}
	}
}