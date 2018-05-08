package MergeSort;

public class Main {
	public static void main(String args[]){
		int array[] = {9, 3, 2, 7, 1, 8, 6, 5, 11};
		Merge merge = new Merge();
		merge.mergeSort(array, 0, array.length-1);
		
		for(int i : array){
			System.out.println(i + ", ");
		}
	}

}


