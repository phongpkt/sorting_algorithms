 public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack = new Stack();
		
		//Operation: Push
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
//        stack.push(10);
//        stack.push(11);
        System.out.print("The stack after push: ");
        stack.print();
        
		//Operation: Pop
        stack.pop();
//        stack.pop();
        System.out.print("The stack after pop: ");
        stack.print();
        
        //Operation: Peek
        System.out.println("The top element of the stack: " + stack.peek());
        
        //Operation: isEmpty
        if (stack.isEmpty()) {
            System.out.println("The stack is empty");
        }
        else {
            System.out.println("The stack is not empty");
        }
	}

}
