package csu.wwj.algorithms.sort;

public class ShellSort extends SortTemplate{
	public void sort(Comparable[] a) {
		int n = a.length;
		int h = 1;
		while(h < n / 3)
			h = 3 * h + 1;
		while(h >= 1) {
			for(int i = 0;i < a.length;i++)
				for(int j = i;j >= h;j -= h)
					if(less(a,j,j - h))
						exch(a,j,j - h);
			h = h / 3;	
		}		
	}
	
	public static void main(String[] args) {
		Comparable[] a = {1,3,5,7,9,8,6,4,2,0};
		SortTemplate st = new ShellSort();
		st.sort(a);	
		st.print(a);
	}
}
