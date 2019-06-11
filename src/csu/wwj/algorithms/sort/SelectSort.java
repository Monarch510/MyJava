package csu.wwj.algorithms.sort;

public class SelectSort extends SortTemplate{
	
	public void sort(Comparable[] a) {
		for(int i = 0;i < a.length;i++) {
			int minindex = i;
			for(int j = i + 1;j < a.length;j++)
				if(less(a,j,minindex))
					minindex = j;
			exch(a,i,minindex);
		}
	}
	
	public static void main(String[] args) {
		Comparable[] a = {1,3,5,7,9,8,6,4,2,0};
		SortTemplate st = new SelectSort();
		st.sort(a);	
		st.print(a);		
	}

}
