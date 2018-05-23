package HashTable;

public class Main {
	public static void main(String args[]){
		LinearProbing<String, Integer> lp = new LinearProbing<>();
		lp.put("a", 3);
		lp.put("b", 4);
		lp.put("fs",5);
		
		
/*		System.out.println(lp.hash("a"));
		System.out.println(lp.hash("b"));
		System.out.println(lp.hash("c"));
		System.out.println(lp.hash("d"));
		System.out.println(lp.hash("fs"));
		System.out.println(lp.hash("fc"));
		System.out.println(lp.hash("we"));
		System.out.println(lp.hash("bdf"));
		System.out.println(lp.hash("vcx"));
		System.out.println(lp.hash("bvcv"));
		System.out.println(lp.hash("ewr"));
		System.out.println(lp.hash("bbv"));
		System.out.println(lp.hash("bvcc"));
		System.out.println(lp.hash("hgf"));
		System.out.println(lp.hash("qwez"));*/
		
		lp.put("we", 40);
		lp.put("bbv", 65);
		lp.put("hgf", 98);
		lp.printHash();
		lp.delete("a");
		lp.printHash();
	}

}
