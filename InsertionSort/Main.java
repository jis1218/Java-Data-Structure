package InsertionSort;

public class Main {
	public static void main(String args[]){
		
		int array[] = {4, 6, 2, 3, 1, 7, 9, 8};
		
		for(int i=1; i<array.length; i++){
			int temp = array[i];
			int index = i;
			for(int j=i-1; j>=0 && array[j]>temp; j--){
				
				array[j+1] = array[j];				
				index = j;
			}
			array[index] = temp;
		}	
		for(int i : array){
			System.out.print(i+", ");
		}
	}	

	
}
