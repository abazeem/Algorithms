public class MergeSort {

	public static void main(String args[])
	{
		int[] a = {7,3,9,2,1};
		mergesort(a,0,a.length-1);
		print(a);
	}
	
	public static  void mergesort(int [] a ,int l ,int r)
	{
		if(l<r)
		{
			int m = (l+r)/2;
			mergesort(a,l,m);
			mergesort(a,m+1,r);
			merge(a,l,m,r);
		}
	}
	public static void print(int[] a)
	{
		for(int i = 0;i<a.length; i++)
			System.out.println(a[i] + " ");
	}
	public static void merge(int[]a , int l ,int m, int r)
	{
		int n1 = m-l + 1;
		int n2 = r-m;
		int[] L = new int[n1];
		int[] R = new int[n2];
		for(int i = 0; i< n1; i++)
			L[i] = a[l+i];
		for(int i = 0; i< n2; i++)
			R[i] = a[m+1+i];
		int i = 0;
		int j = 0;
		int k = l;
		while(i<n1 && j<n2)
		{
			if(L[i]<= R[j])
			{
				a[k] = L[i];
				i++;
			}
			else
			{
				a[k] = R[j];
				j++;
			}
			k++;
		}
		while(i<n1)
		{
			a[k] = L[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			a[k] = R[j];
			j++;
			k++;
		}
	}
}
