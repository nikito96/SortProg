package sorting;

public class Sort {
	
	private int[] arr;
	
	public void initArray(int size){
		arr = new int[size];
	}
	
	public void deleteArray() {
		arr = null;
	}
	
	public void enterArr(int i, int integer) {
		arr[i] = integer;
	}
}
