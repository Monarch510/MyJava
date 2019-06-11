package designModule.DataOperation;

public class Adapter implements DataOperation{
	
	public Adapter() {
		
	}

	@Override
	public void sort(int[] list) {
		// TODO Auto-generated method stub
		QuickSort.quickSort(list);
	}

	@Override
	public int search(int[] list, int key) {
		// TODO Auto-generated method stub
		return BinarySearch.binarySearch(list, key);
	}

}
