package HashTable;

public class LinearProbing<Key, Value> {
	private static final int M = 13; //테이블 크기
	private Key[] a = (Key[]) new Object[M];
	private Value[] b = (Value[]) new Object[M];
	private int hash(Key key){
		return (key.hashCode() & 0x7fffffff)%M; //key.hashCode()가 음수일 경우 마이너스 부호를 벗겨낸 후 M의 나머지를 구한다.
	}
	
	private void put(Key key, Value data){
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

}
