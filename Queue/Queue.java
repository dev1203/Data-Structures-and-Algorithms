public class Queue<T extends Comparable<T>>{
	private Node<T> head;
	private Node<T> tail;
	private int size;

	public void enqueue(T data){	
		Node<T> newnode = new Node<>(data);
		if(head == null){
			head = newnode;
			tail = newnode;
		}
		else{
			tail.setNextNode(newnode);
			tail = tail.getNextNode();
		}
		this.size++;
	}

	public boolean isEmpty(){
		return this.head == null;
	}

	public int size(){
		return this.size;
	}

	public T dequeue(){
		T data = head.getData();

		if(head.getNextNode() == null){
			head = null;
			tail = null;
			return data;
		}

		head = head.getNextNode();
		return data;
	}
}
