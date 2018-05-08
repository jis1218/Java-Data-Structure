package MergeSort;

public class Merge{
	void mergeSort(int array[], int p, int r){
		if(r-p>0){ //길이가 2 이상일 경우만 취급
			int q = (p+r)/2;
			mergeSort(array, p, q);
			mergeSort(array, q+1, r);
			merge(array, p, r);
		}
	}
	
	private void merge(int array[], int p, int r){
		int newArray[] = new int[r-p+1]; //길이가 r-p+1인 array를 만든다.
		int cnt = 0; //newArray에 들어갈 때 순서대로 가도록 한다.
		int mid = (p+r)/2; //중간 포인트
		int temP = p; 
		int temQ = mid+1; 
		while(temP<=mid || temQ<=r){ //둘다 지정한 숫자보다 크게 되면 멈춘다.				
			if(temP<=mid && temQ<=r){
				if(array[temQ]>array[temP]){
					newArray[cnt++] = array[temP];
					temP++;
				}else{
					newArray[cnt++] = array[temQ];
					temQ++;
				}
			}else if(temP>mid){
				newArray[cnt++] = array[temQ];
				temQ++;
			}else if(temQ>r){
				newArray[cnt++] = array[temP];
				temP++;
			}
		}
		//newArray의 숫자를 array에 넣어준다.
		for(int i=p; i<=r; i++){
			array[i] = newArray[i-p];
		}
	}
}