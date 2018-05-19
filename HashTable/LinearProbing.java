package HashTable;

public class LinearProbing<Key, Value> {
	private static final int M = 13; //���̺� ũ��
	private Key[] a = (Key[]) new Object[M];
	private Value[] b = (Value[]) new Object[M];
	private int hash(Key key){
		return (key.hashCode() & 0x7fffffff)%M; //key.hashCode()�� ������ ��� ���̳ʽ� ��ȣ�� ���ܳ� �� M�� �������� ���Ѵ�.
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
	
	public Value get(Key key){ //hash ���̺��� �� á�� ��� ã�ƾ� �ϴ� ��� key�� hash ���̺� �ִٰ� ����
		int initialPos = hash(key);
		int i = initialPos, j=1;
		while(a[i]!=null){
			if(a[i].equals(key)) return b[i];
			i = (initialPos+j++)%M;
		}
		return null;
	}

}
