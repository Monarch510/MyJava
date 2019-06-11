package csu.wwj.algorithms.sort;

public abstract class SortTemplate {
	public void sort(Comparable[] a) {
	}
	
	static void exch(Comparable[] a,int e1,int e2) {
		Comparable temp = a[e1];
		a[e1] = a[e2];
		a[e2] = temp;
	}
	
	public void print(Comparable[] a) {
		for(int i = 0;i < a.length;i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}
	
	static boolean less(Comparable[] a,int e1,int e2) {
		return a[e1].compareTo(a[e2]) < 0;
	}

}
