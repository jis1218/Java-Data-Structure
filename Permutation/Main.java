package Permutation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
	public static void main(String args[]){
		int[] arr = {1, 2, 3, 4};
		ArrayList<int[]> list = new ArrayList<>();
		perm(arr, 0, list);
		for(int[] ele : list){
			for(int i : ele){
				System.out.print(i + ", ");
			}
			System.out.println("");
		}
		
		String number = "1234";
		String result = "";
		for(int i=1; i<=number.length(); i++){
			perm(number, result, i);
		}
		for(int i : set){
			System.out.println(i);
		}
	}
	
	static void perm(int[] nums, int start, List<int[]> result){
		if(start == nums.length){
			result.add((int[])nums.clone());
			return;
		}
		
		for(int i=start; i<nums.length; i++){
			swap(nums, start, i);
			perm(nums, start + 1, result);
			swap(nums, start, i);
		}
	}
	
	static void swap(int[] nums, int a, int b){
		if(a==b) return;
		int temp = nums[a];
		nums[a] = nums[b];
		nums[b] = temp;
	}
	
	static HashSet<Integer> set = new HashSet<>();
	public static void perm(String number, String result, int num){
		if(result.length()==num){			
			set.add(Integer.valueOf(result));
			return;
		}
		for(int i=0; i<number.length(); i++){
			char c = number.charAt(i);
			result += c;
			perm(number.substring(0, i) + number.substring(i+1, number.length()), result, num);
			result = result.substring(0, result.length()-1);
		}
	}

}
