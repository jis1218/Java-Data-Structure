package HashTable;

public class LinearProbing<Key, Value> {
	private static final int M = 13; //���̺� ũ��
	private Key[] a = (Key[]) new Object[M];
	private Value[] b = (Value[]) new Object[M];
	public int hash(Key key){
		return (key.hashCode() & 0x7fffffff)%M; //key.hashCode()�� ������ ��� ���̳ʽ� ��ȣ�� ���ܳ� �� M�� �������� ���Ѵ�.
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
	
	public Value get(Key key){ //hash ���̺��� �� á�� ��� ã�ƾ� �ϴ� ��� key�� hash ���̺� �ִٰ� ����
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
		
		//Ȥ�ö� �и� �����Ͱ� �ִٸ� ���ڸ��� ã���ش�.
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
			System.out.println("�迭�� " + i + "��°�� Key : " + a[i] + ", Value : " + b[i]);
		}
	}

}
