package ArrayList;
import java.util.Arrays;

public class MyArrayList<T> {
	private T array[];
	private int size;
	
	@SuppressWarnings("unchecked")
	public MyArrayList() {
		array = (T[]) new Object[10];
		Arrays.fill(array, null);
		size = 0;
	}

	
	public void add(T a){
		array[size]=a;
		size++;
		if(array.length*3/4==size){
			resize(array.length*2);
		}
	}
	
	public void add(int index, T a){
		for(int i=index; i<size; i++){
			array[i+1] = array[i];
		}
		array[index]=a;
		size++;	
		if(array.length*3/4==size){
			resize(array.length*2);
		}
	}
	
	public void remove(int index){
		for(int i=index; i<size; i++){
			array[i] = array[i+1];
		}
		size--;
		if(array.length*1/4==size){
			resize(array.length/2);
		}
	}
	
	public void clear(){
		
	}
	
	public T get(int index){		
		
		return array[index];
	}
	
	public int size(){
		return size;
	}
	
	private void resize(int newSize){
		@SuppressWarnings("unchecked")
		T newArray[] = (T[]) new Object[newSize];
		for(int i=0; i<size; i++){
			newArray[i]=array[i];
		}
		array=newArray;		
	}

}
