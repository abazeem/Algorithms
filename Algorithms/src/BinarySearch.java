public class BinarySearch {

	public static void main(String args[])
	{
		int[] a = {1,2,3,4,4,4,6,8,8,8};
		//search1(a,x);
		//search2(a,0,a.length-1,x);
		System.out.println(binsearchf(a,0,a.length-1, 5));
		System.out.println(binsearchl(a,0,a.length-1, 5));
 	}
	
	public static boolean search1(int[] a, int x)
	{
		int l = 0;
		int r = a.length-1;
		while(l<=r)
		{
			int mid = (l + r)/2;
			if(a[mid] == x)
				return true;
			else
			{
				if(x>a[mid])
					l = mid+1;
				else
					r = mid-1;
			}
		}
		return false;
	}
	
	public static boolean search2(int[] a , int l , int r , int x)
	{
		if(l>r)
			return false;
		int mid = (l + r)/2;
		if(a[mid]==x)
			return true;
		else
		{
			if(x>a[mid])
				return search2(a,mid+1,r,x);
			else
				return search2(a,l,mid-1,x);
		}
	}
	
	public static int binsearchf(int[] a, int l , int r, int x)
	{
		if(l<=r)
		{
			int m = (l + r)/2;
			if( a[m] == x)
			{
				if(m == 0) 
					return m;
				else if(a[m-1] < a[m])
					return m;
			}
			if(a[m] >= x)
				return binsearchf(a,l,m-1,x);
			else
				return binsearchf(a, m+1, r,x);
		}
		return -1;
	}
	
	public static int binsearchl(int[] a, int l , int r, int x)
	{
		if(l<=r)
		{
			int mid = (l + r)/2;
			if( a[mid] == x )
			{
				if(mid == a.length - 1)
					return mid;
				else if( a[mid + 1] > a[mid])
					return mid;
			}
			if(a[mid] <= x)
				return binsearchl(a,mid+1,r,x);
			else
				return binsearchl(a, l, mid-1,x);
		}
		return -1;
	}
}
