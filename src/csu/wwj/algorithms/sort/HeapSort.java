package csu.wwj.algorithms.sort;

public class HeapSort extends SortTemplate{
	public void sort(Comparable[] a) {
		int n = a.length - 1;
		for(int i = n / 2;i >= 1;i--) {
			sink(a,i,n);
		}
		while(n > 1) {
			exch(a,1,n--);
			sink(a,1,n);
		}
	}
	
	static void sink(Comparable[] a,int k,int n) {
		while(2 * k <= n) {
			int j = 2 * k;
			if(j < n && less(a,j,j + 1))
					j++;
			if(!less(a,k,j))
				break;
			exch(a,k,j);
			k = j;
		}
	}
	
	
	public static void main(String[] args) {
		Comparable[] a0 = {1,3,5,7,9,8,6,4,2,0};
		Comparable[] a = new Comparable[a0.length + 1];
		for(int i = 1;i < a.length;i++)
			a[i] = a0[i - 1];
		SortTemplate st = new HeapSort();
		st.sort(a);
		for(int i = 0;i < a0.length;i++)
			a0[i] = a[i + 1];
		st.print(a0);
	}
}
