package QuickSort;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quick quick = new Quick();
		int array[] = {3, 5, 1, 2, 8, 6, 4, 9, 13, 11, 65, 34, 76, 21, 75};
		quick.quickSort(array, 0, array.length-1);
		
		for(int i: array) System.out.print(i + ", ");

	}

}
