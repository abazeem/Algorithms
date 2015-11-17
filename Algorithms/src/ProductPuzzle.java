
public class ProductPuzzle {

	public static void main(String args[])
	{
		int[] a = {10,20,30,40};
		calc(a);
	}
	
	public static void calc(int[] a)
	{
		int[] prod = new int[a.length];
		int n = a.length;
		int temp = 1;
		for(int i = 0; i<n; i++)
		{
			prod[i] = temp;
			temp = temp*a[i];
		}
		temp = 1;
		for(int i = n-1; i>=0; i--)
		{
			prod[i] *= temp;
			temp *= a[i];
		}
		
		for(int i = 0; i< n ; i++)
			System.out.print(prod[i] +" ");
	}
}
