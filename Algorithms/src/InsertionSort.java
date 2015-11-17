public class InsertionSort {

	public static void main(String args[])
	{
		int[] a = {7,3,9,2,1};
		sort(a);
	}
	
	public static void sort(int [] a)
	{
		for(int i = 1; i < a.length; i++)
		{	
			for(int j = 0;j<i;j++)
			{
				if(a[j]>a[i])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for(int i = 0;i<a.length; i++)
		{
			System.out.println(a[i] + " ");
		}
	}
}
