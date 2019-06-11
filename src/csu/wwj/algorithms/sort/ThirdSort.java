package csu.wwj.algorithms.sort;

public class ThirdSort extends SortTemplate{
	
	public void sort(Comparable[] a) {
		thirdSort(a,0,a.length - 1);
	}
	
	static void thirdSort(Comparable[] a,int lo,int hi) {
		if(lo >= hi)
			return ;
		int it = lo;
		int i = lo + 1;
		int j = hi;
		Comparable v = a[lo];
		while(i <= j) {
			if(compare(v,a[i]) > 0)
				exch(a,it++,i++);
			else if(compare(v,a[i]) < 0)
				exch(a,i,j--);
			else
				i++;
		}
		thirdSort(a,lo,it - 1);
		thirdSort(a,j + 1,hi);
	}
	
	static int compare(Comparable e1,Comparable e2) {
		return e1.compareTo(e2);
	}
	
	public static void main(String[] args) {
		Comparable[] a = {1,3,5,7,9,8,6,4,2,0};
		SortTemplate st = new ThirdSort();
		st.sort(a);
		st.print(a);
	}

}
