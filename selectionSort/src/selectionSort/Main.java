package selectionSort;

public class Main {
	
	public static void main(String[] args) {
	
		int[] numberArray = {2,5,6,4,54,34,32,4,9,72};
	    selectionSort(numberArray);
	    int[] newArray = numberArray;
	    for(int i = 0; i < newArray.length; i++) {
		System.out.print(" " + newArray[i]);
	    }
	}
	
	public static void selectionSort(int[] arr) {
	
		for(int i = 0; i < arr.length; i++) {
			int min = i;
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}
}
