package csu.wwj.algorithms.sort;

public class QuickSort extends SortTemplate{
	public void sort(Comparable[] a) {
		quickSort(a,0,a.length - 1);
	}
	
	static void quickSort(Comparable[] a,int lo,int hi) {
		if(lo >= hi)
			return ;
		int j = partition(a,lo,hi);
		quickSort(a,lo,j - 1);
		quickSort(a,j + 1,hi);
	}
	
	static int partition(Comparable[] a,int lo,int hi) {
		int i = lo;
		int j = hi + 1;
		Comparable v = a[lo];
		while(true) {
			while(less(a[++i],v))
				if(i == hi)
					break;
			while(less(v,a[--j]))
				if(j == lo)
					break;
			if(i >= j)
				break;
			exch(a,i,j);
		}
		exch(a,lo,j);
		return j;
	}
	
	static void exch(Comparable[] a,int e1,int e2) {
		Comparable temp = a[e1];
		a[e1] = a[e2];
		a[e2] = temp;
	}
	
	
	static boolean less(Comparable e1,Comparable e2) {
		return e1.compareTo(e2) < 0;
	}
	
	public static void main(String[] args) {
		Comparable[] a = {1,3,5,7,9,8,6,4,2,0};
		SortTemplate st = new QuickSort();
		st.sort(a);
		st.print(a);
	}
}
