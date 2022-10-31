package containsDuplicate;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		int[] array = {1,4,6,3,9,4};
		int[] array2 = {1,4,6,3,9};
		
		System.out.println(isDuplicated(array));
		System.out.println(isDuplicated(array2));
		System.out.println("----------------------------");
		
		List<Integer> liste2 = new ArrayList<Integer>();
		liste2.add(1);
		liste2.add(4);
		liste2.add(6);
		liste2.add(3);
		liste2.add(9);
		System.out.println(isDuplicated2(liste2));
		
	}
	
	//O(n^2) 
	public static boolean isDuplicated(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++)
			{
				if(arr[i] == arr[j]) {
					return true;
				}
			}
		}
			return false;
	}
	
	//O(n)
	public static boolean isDuplicated2(List<Integer> liste) {
		List<Integer> listeYeni = new ArrayList<Integer>();
		
		for(int i = 0; i < liste.size(); i++){
			if(listeYeni.contains(liste.get(i))) {
				
				return true;
			}
			listeYeni.add(liste.get(i));	
		}
		return false;
	}
	
}
