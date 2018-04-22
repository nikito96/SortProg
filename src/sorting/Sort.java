package sorting;

public class Sort {
	
	private int[] arr;
	private String sortedArray = "Sorted array: ";
	private int i = -1;
	
	int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = (low-1);
		
		for(int j = low; j < high; ++j) {
			if(arr[j] < pivot) {
				++i;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
		
		return i + 1;
	}
	
	void quickSort(int[] arr, int low, int high) {
		if(low < high) {
			int pi = partition(arr, low, high);
			
			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}
	}
	
	public String sort(int high) {
		quickSort(arr, 0, high - 1);
		for(int i = 0; i < arr.length; i++) {
			sortedArray.concat(Integer.toString(arr[i]));
		}
		return sortedArray;
	}
	
	public void initArray(int size){
		arr = new int[size];
	}
	
	public void deleteArray() {
		arr = null;
	}
	
	public void enterArr(int integer) {
		i++;
		arr[i] = integer;
	}
}
