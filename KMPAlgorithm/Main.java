package KMPAlgorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String a = scan.next();
		String b = scan.next();
		//String a = "ABC ABCDAB ABCDABCDABDE";
		//String b = "ABCDABD";
		//Scanner scan;
		int[] aa = new int[1000000];
		for(int i=0; i<1000000; i++){
			aa[i] = i;
		}
		System.out.println(KMPAlgo2(a,b).length);
		for(int i :KMPAlgo2(a, b)) System.out.println(i);
		
		

	}

	
	public static int[] KMPAlgo2(String a, String b){
		ArrayList<Integer> list = new ArrayList<>();
		
		int[] table = makeTable(b);
		int j=0;
		for(int i=0; i<a.length(); i++){
			while(j>0 && a.charAt(i)!=b.charAt(j)){
				j = table[j-1];
			}
			if(a.charAt(i)==b.charAt(j)){
				if(j==b.length()-1){
					list.add(i-b.length()+1);
					j = table[j];
				}else{
					j++;
				}
			}
		}
		
		return list.stream().mapToInt(i->i+1).toArray();
		
	}
	
	public static int[] makeTable(String b){
		int[] arrB = new int[b.length()];
		int j=0;
		for(int i=1; i< arrB.length; i++){
			while(j>0 && b.charAt(i)!=b.charAt(j)){
				j = arrB[j-1];
			}
			if(b.charAt(i)==b.charAt(j)){
				arrB[i] = ++j;
			}
		}
		
		return arrB;
	}
	
	
	public static int[] findTable(String b){
		int[] arrB = new int[b.length()];
		
		int index = 0;
		arrB[0]=0;
		for(int i = 1; i<arrB.length; i++){
			if(b.charAt(index)==b.charAt(i)){
				arrB[i] = arrB[i-1]+1;
				index++;
			}else if(b.charAt(0)==b.charAt(i)){
				arrB[i] = 1;
				index=1;
			}else{
				arrB[i] = 0;
				index=0;
			}
		}		
		return arrB;
	}
	
	public static int[] KMPAlgo(String a, String b){
		
		int indexA=0;
		int indexB=0;
		int count = 0;
		int[] arrB = findTable(b);
		ArrayList<Integer> list = new ArrayList<>();
		while(indexA+indexB<=a.length() && indexA<a.length()){
			System.out.println("while¹® " + indexA + ", " + indexB);
			if(a.charAt(indexA)==b.charAt(indexB)){
				for(int i=indexB+1; i<b.length(); i++){
					indexA++;
					//count++;
					if(indexA>=a.length()) break;
					System.out.println(indexA + ", " + i);
					if(a.charAt(indexA)!=b.charAt(i)){
						indexB = arrB[i-1];						
						break;
					}
					if(i==b.length()-1){
						indexB = arrB[i-1];
						list.add(indexA-b.length()+1);
						count++;
						break;
					}
				}
			}else{
				indexA++;
				indexB=0;
				//count++;
			}
			
		}
		
		System.out.println("Count is " + count);
		
		return list.stream().mapToInt(i->i+1).toArray();
		
	}


}
