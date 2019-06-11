package csu.wwj.algorithms.sort;

public class InsertSort extends SortTemplate{
	
	public void sort(Comparable[] a) {
		for(int i = 1;i < a.length;i++) {
			int currentindex = i;
			for(int j = i - 1;j >= 0;j--)
				if(less(a,currentindex,j)) {
					exch(a,currentindex,j);
					currentindex = j;
				}
		}
	}
	
	public static void main(String[] args) {
		Comparable[] a = {1,3,5,7,9,8,6,4,2,0};
		SortTemplate st = new InsertSort();
		st.sort(a);
		st.print(a);
	}

}
