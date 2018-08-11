/*
	- Stack Implementation for int
	- Methods:
	- pop(): Remove from the top of the stack
	- push(values): adds an int value to the top of the stack
	- isEmpty(): Checks if the stack is empty or not
*/

public class stack{
	Node root;
	int size;

	public void push(int data){
		if(root == null){
			root = new Node(data);
		}
		else{
			Node temp = new Node(data);
			temp.next=root;
			root= temp;
		}
		this.size++;
	}

	public int pop(){
		int data= root.data;
		if(root.next == null){
			root = null;
			return data;
		}
		root = root.next;
		return data;
	}

	public boolean isEmpty(){
		return root==null;
	}

	public static void main(String []args){
		stack s = new stack();
		s.push(10);
		s.push(11);
		while(!s.isEmpty()){
			System.out.println(s.pop());
		}
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
	Node next;
	int data;

	public Node(int data){
		this.data = data;
	}
}