package csu.wwj.algorithms.sort;

public class BubbleSort extends SortTemplate{
	public void sort(Comparable[] a) {
		int n = a.length;
		for(int i = 0;i < a.length - 1;i++)
		for(int j = 0;j < n - 1;j++)
			if(less(a,j + 1,j))
				exch(a,j,j + 1);
		n--;
	}
	

	public static void main(String[] args) {
		Comparable[] a = {1,3,5,7,9,8,6,4,2,0};
		SortTemplate st = new BubbleSort();
		st.sort(a);
		st.print(a);
	}
}
