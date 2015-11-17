//Maximum sum contiguous
public class KadanesAlgorithm {

	public static void main(String args[])
	{
		int[] a = {-2, -3, -4, -1, -2, -1, -5, -3};
		DP(a);
	}
	
	public static void Maxcontiguous(int [] a)
	{
		int  max_sum = 0;
		int  max_sofar = 0;
		for(int i = 0;i<a.length;i++)
		{
			max_sum = max_sum + a[i];
			if(max_sum < 0)
				max_sum = 0;
			else
			{
				if(max_sum>max_sofar)
					max_sofar = max_sum;
			}
		}
		System.out.println(max_sofar);
	}
	
	public static void DP(int[] a)
	{
		int max_curr = a[0];
		int MAX = a[0];
		for( int i  = 1; i< a.length; i++)
		{
			max_curr = Math.max(a[i], max_curr + a[i]);
			MAX = Math.max(MAX,max_curr);
		}
		System.out.println(MAX);
	}
	
}
