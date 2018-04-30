### ArrayList

##### 배열을 이용해 ArrayList를 만들어 보았다. 핵심은 리스트의 사이즈를 확인하여 배열을 늘려주거나 줄여주는 것
```java
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
```