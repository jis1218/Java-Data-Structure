package DepthFirstSearch;

public class DFS {
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
		
		System.out.print(i+", ");		
		
		visited[i]=true;
		for(int j=0; j<ref.length; j++){
			if(ref[i][j] && !visited[j]){
				search(j);
			}

		}
		
	}

}
