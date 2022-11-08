package exercises.string;

public class InsertionSort {
	public static void main(String[] args) {
		
		int[] array = new int[] {12,3,24,25,23,55};
		
		for(int s : array) {
			System.out.print(s + " ");
		}
		
		System.out.println("\n---");
		insertionSort(array);
		
		for(int s : array) {
			System.out.print(" "+s);
		}
	}

	public static void insertionSort(int[] arr) {
		for(int i = 1; i < arr.length; i++) {
			int number = arr[i];
			int j = i - 1;
			
			while(j >= 0 && arr[j] > number) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = number;
		}
	}
	
}
