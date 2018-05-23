package HashTable;

public class LinearProbing<Key, Value> {
	private static final int M = 13; //테이블 크기
	private Key[] a = (Key[]) new Object[M];
	private Value[] b = (Value[]) new Object[M];
	public int hash(Key key){
		return (key.hashCode() & 0x7fffffff)%M; //key.hashCode()가 음수일 경우 마이너스 부호를 벗겨낸 후 M의 나머지를 구한다.
	}
	
	public void put(Key key, Value data){
		int initialPos = hash(key);
		int i = initialPos, j=1;
		do{
			if(a[i]==null){
				a[i]=key;
				b[i]=data;
				return;
			}
			if(a[i].equals(key)){
				b[i]=data;
				return;
			}
			i = (initialPos+j++)%M;
		}while(i!=initialPos);
	}
	
	public Value get(Key key){ //hash 테이블이 꽉 찼을 경우 찾아야 하는 모든 key가 hash 테이블에 있다고 가정
		int initialPos = hash(key);
		int i = initialPos, j=1;
		while(a[i]!=null){
			if(a[i].equals(key)) return b[i];
			i = (initialPos+j++)%M;
		}
		return null;
	}
	
	public void delete(Key key){
		if(get(key)==null) return;
		
		int i=hash(key);
		while(!key.equals(a[i])){
			i = (i+1)%M;
		}
		a[i] = null;
		b[i] = null;
		
		//혹시라도 밀린 데이터가 있다면 제자리로 찾아준다.
		i = (i+1)%M;
		while(a[i]!=null){
			Key keyToRehash = a[i];
			Value valToRehash = b[i];
			a[i] = null;
			b[i] = null;
			
			put(keyToRehash, valToRehash);
			i = (i+1)%M;
		}
	}
	
	public void printHash(){
		for(int i=0; i<a.length; i++){
			System.out.println("배열의 " + i + "번째는 Key : " + a[i] + ", Value : " + b[i]);
		}
	}

}
