package Stack;

public class Main {
	public static void main(String[] args) {
		
		ListStack<Integer> stack = new ListStack<>();
		stack.push(3);
		stack.push(5);
		stack.push(7);
		System.out.println(stack.getSize());
		System.out.println(stack.toString());
		stack.pop();
		System.out.println(stack.toString());
		System.out.println(stack.getTop());
	}

}
