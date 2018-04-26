package Queue;

public class Main {

	public static void main(String[] args) {
		ListQueue<Integer> queue = new ListQueue<>();
		
		queue.push(3);
		queue.push(5);
		queue.push(9);
		
		System.out.println(queue.toString());
		System.out.println(queue.getTop());

	}

}
