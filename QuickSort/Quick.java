package QuickSort;

public class Quick {
	public int partition(int array[], int p, int r){
		int greaterStart = p;
		int unknownStart = p;
		
		while(unknownStart<r){
			if(array[unknownStart]<array[r]){
				int temp = array[unknownStart];
				array[unknownStart] = array[greaterStart];
				array[greaterStart] = temp;
				greaterStart++;
				unknownStart++;
			}else{
				unknownStart++;
			}
		}
		
		int temp = array[r];
		array[r] = array[greaterStart];
		array[greaterStart] = temp;
		
		return greaterStart;
		
	}
	
	public void quickSort(int array[], int p, int r){
		if(r-p>0){
			int pivotIndex = partition(array, p, r);
			quickSort(array, p, pivotIndex-1);
			quickSort(array, pivotIndex+1, r);
		}
	}
}
