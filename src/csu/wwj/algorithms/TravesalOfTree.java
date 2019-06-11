package csu.wwj.algorithms;
//仅仅针对完全二叉树
public class TravesalOfTree {
	//前序变中序
	static void ptm(int []a,int lo,int hi) {
		if(lo >= hi)
			return ;
		int mid = (lo + hi) / 2;
		int temp = a[lo];
		for(int i = lo;i <= mid;i++) {
			if(i == mid)
				a[i] = temp;
			else
				a[i] = a[i + 1];
		}
		ptm(a,lo,mid - 1);
		ptm(a,mid + 1,hi);
	}
	//中序变后序
	static void mte(int []a,int lo,int hi) {
		if(lo >= hi) {
			return ;
		}
			
		int mid = (lo + hi) / 2;
		int temp = a[mid];
		
		for(int i = mid;i <= hi;i++) {
			if(i == hi)
				a[i] = temp;
			else
				a[i] = a[i + 1];
		}
		mte(a,lo,mid - 1);
		mte(a,mid,hi - 1);
	}
	
	static void print(int[] a) {
		for(int i = 0;i < a.length;i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {4,2,1,3,6,5,7};
		print(a);
		ptm(a,0,a.length - 1);
		print(a);
		mte(a,0,a.length - 1);
		print(a);
	}

}
