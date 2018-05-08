package MergeSort;

public class Merge{
	void mergeSort(int array[], int p, int r){
		if(r-p>0){ //���̰� 2 �̻��� ��츸 ���
			int q = (p+r)/2;
			mergeSort(array, p, q);
			mergeSort(array, q+1, r);
			merge(array, p, r);
		}
	}
	
	private void merge(int array[], int p, int r){
		int newArray[] = new int[r-p+1]; //���̰� r-p+1�� array�� �����.
		int cnt = 0; //newArray�� �� �� ������� ������ �Ѵ�.
		int mid = (p+r)/2; //�߰� ����Ʈ
		int temP = p; 
		int temQ = mid+1; 
		while(temP<=mid || temQ<=r){ //�Ѵ� ������ ���ں��� ũ�� �Ǹ� �����.				
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
		//newArray�� ���ڸ� array�� �־��ش�.
		for(int i=p; i<=r; i++){
			array[i] = newArray[i-p];
		}
	}
}