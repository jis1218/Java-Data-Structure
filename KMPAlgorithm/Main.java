package KMPAlgorithm;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "abcvczvabcwerabcdgasdf";
		String b = "abcd";
		int [] pi = findPrefix(b);
		int j=0;
		
		for(int i=0; i<a.length(); i++){
			while(j>0 && a.charAt(i)!=b.charAt(j)){
				j = pi[j-1];
			}
			if(a.charAt(i)==b.charAt(j)){
				if(j==b.length()-1){
					j = pi[j];
				}
				else j++;
			}
		}
		
		
		
		

	}
	
	static int[] findPrefix(String s){
		int m = s.length();
		int[] pi = new int[m];
		int j=0;
		for(int i=1; i<m; i++){
			while(j>0 && s.charAt(i)!=s.charAt(j)){
				j = pi[j-1];
			}
			if(s.charAt(i)==s.charAt(j)){
				pi[i]=++j;
			}
		}
		
		return pi;
	}

}
