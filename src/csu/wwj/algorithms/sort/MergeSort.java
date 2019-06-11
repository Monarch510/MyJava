package csu.wwj.algorithms.sort;

public class MergeSort extends SortTemplate{
	
	//自顶向下
	public static void mergeSort(Comparable[] a,int lo,int hi) {
		if(lo == hi)
			return ;
		int mid = (lo + hi) / 2;
		mergeSort(a,lo,mid);
		mergeSort(a,mid + 1,hi);
		merge(a,lo,mid,hi);
	}
	
	//自底向上
	public void sort(Comparable[]a) {
		//mergeSort(a,0,a.length - 1);
		int k = 1;
		while(k <= a.length) {
			for(int i = 0;i < a.length;i = i + 2 * k) {
				if(i + k > a.length) {}
				else if(i + 2 * k > a.length && i + k <= a.length)
					merge(a,i,i + k - 1,a.length - 1);
				else
					merge(a,i,i + k - 1,i + 2 * k - 1);
			}
			k = 2 * k;
		}	
	}
	
	static void merge(Comparable[] a,int lo,int mid,int hi) {
		Comparable[] b = new Comparable[a.length];
		for(int i = 0;i < a.length;i++) 
			b[i] = a[i];
		int i = lo;
		int j = mid + 1;
		for(int k = lo;k <= hi;k++)
			if(i > mid)
				a[k] = b[j++];
			else if(j > hi)
				a[k] = b[i++];
			else if(less(b,i,j))
				a[k] = b[i++];
			else
				a[k] = b[j++];	
	}

	public static void main(String[] args) {
		Comparable[] a = {1,3,5,7,9,8,6,4,2,0};
		SortTemplate st = new MergeSort();
		st.sort(a);
		st.print(a);
	}
	
}
