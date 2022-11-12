package removeDuplicates;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		int[] array = new int[] {1,2,2,3,3,5,5,5,6,7,8,8};
		
		int n = array.length;
		int j = 0;
		
		for(int i = 0; i < n - 1; i++) {
			if(array[i] != array[i+1]) {
				array[j++] = array[i];
			}
		}
		
		array[j++] = array[n - 1];
		
		for(int k = 0; k < j; k++) {
			System.out.println(array[k]);
		}
		
	}
		
		
/*
		Integer[] array = new Integer[] {1,2,2,3,4,4};
		
		System.out.println(removeDuplicates(array));
		
		int[] temp = new int[10];
		int j = 0;
		System.out.println(temp[j++]);
		System.out.println(j);
		System.out.println(j);
		System.out.println(temp[++j]);
		System.out.println(j);
	}
	
	public static Integer[] removeDuplicates(Integer[] arr) {
		
		if(arr.length == 0) {
			return new Integer[0];
		}
		
		List<Integer> result = new ArrayList<Integer>();
		result.add(arr[0]);
		int lastItem = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			if(lastItem != arr[i]) {
				lastItem = arr[i];
				result.add(lastItem);
			}
		}
		return result.toArray(Integer[]::new);
	}*/

	
}
