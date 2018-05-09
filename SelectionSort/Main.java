package SelectionSort;

public class Main {

	public static void main(String[] args) {
		int array[] = {3, 6, 2, 4, 8, 1, 7, 0};
		
		for(int i=0; i<array.length-1; i++){
			int minIndex = i;
			int min = array[i];
			for(int j=i+1; j<array.length; j++){				
				if(array[j]<min){
					min = array[j];
					minIndex = j;
				}				
			}
			int temp = array[i];
			array[i] = array[minIndex];
			array[minIndex] = temp;			
		}
		
		for(int i: array){
			System.out.print(i+", ");
		}


	}

}
