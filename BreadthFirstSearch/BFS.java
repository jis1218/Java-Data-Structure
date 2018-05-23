package BreadthFirstSearch;
import Queue.ListQueue;

public class BFS {
	boolean[][] ref = {
			{false, false, false, false, false, true, true},
			{false, false, false, true, false, false, false},
			{false, false, false, false, true, false, true},
			{false, true, false, false, false, false, true},
			{false, false, true, false, false, false, false},
			{true, false, false, false, false, false, false},
			{true, false, true, true, false, false, false},
	};
	
	boolean [] visited = new boolean[ref.length];
	
	
	void search(int i){
		ListQueue<Integer> queue = new ListQueue<>(); 
		queue.push(i);
		visited[i]=true;
		
		while(!queue.isEmpty()){
			int x = queue.pop();
			System.out.print(x + ", ");
			for(int j=0; j<ref.length; j++){
				if(ref[x][j] && !visited[j]){
					queue.push(j);
					visited[j]=true;
				}
			}
		}
		
	}

}
