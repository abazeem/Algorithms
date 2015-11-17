
//Moore's Voting Algorithm
public class Majority {
	
	public static void main(String args[])
	{
		int[] a = {1,1,1,1,6,7};
		int cand = findcand(a);
		if(isMaj(a,cand))
			System.out.println("Majority element present " + cand);
		else
			System.out.println("No Majority element");
	}
	
	public static int findcand(int[] a)
	{
		int count = 1;
		int majindex = 0;
		for(int i = 1;i<a.length;i++)
		{
			if(a[majindex]==a[i])
				count++;
			else
				count--;
			if(count==0)
			{
				majindex = i;
				count = 1;
			}
		}
		return a[majindex];
	}
	
	public static boolean isMaj(int[]a,int cand)
	{
		int count = 0;
		for(int i = 0;i<a.length;i++)
		{
			if(a[i]== cand)
				count++;
		}
		if(count>a.length/2)
			return true;
		else 
			return false;
	}
}
