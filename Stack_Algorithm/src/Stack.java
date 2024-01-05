public class Stack<E> {	
	public class Node<E> {
		E data; // data
		Node next; // pointer to the next node
		
		public Node(E data) {
			this.data = data;
			this.next = null;
		}
	}
	private Node top = null;
	private int size = 0;
	private int MAX_LENGTH;
	
	// Set max length to the stack
	Stack(){
		this.MAX_LENGTH = 10;
	}
	
	public void push(E data){
		Node node = new Node(data);
		// Check if the stack is overflow
		if(size == MAX_LENGTH) {
			System.out.println("Stack is overflow");
			System.out.print("Remove element: " + data);
		}
		else {
			if(isEmpty() == true) {
				// When adding the first node to the stack
				top = node;
			}
			else {
				// When adding a node to the queue
				node.next = top;
				top = node;
			}
			size++;
		}
	}

	public boolean isEmpty() {
		if (size <= 0)
			return true;
		else
			return false;
	}

	public E peek() {
		// When stack is empty
		if (isEmpty() == true) {
			System.out.println("The stack is empty");
			return null;
		}
		else
			return (E) top.data;
	}

	public void pop()
	{
		// Check if the stack is underflow
		if (isEmpty() == true) {
			System.out.println("Stack is underflow");
		}
		//pop an element out of the stack
		else{
			Node temp = top;
			top = top.next;
			temp.next = null;
		}
		// decrease stack's size by 1
		size--;
	}
	public void print() {
		Node current = top;
		while (current.next != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.print(current.data);
		System.out.println();
	}
}
