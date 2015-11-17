import java.util.Arrays;

public class SuffixArray {

	public static void main(String args[])
	{
		String text = "banana";
		int l = text.length();
		Suffix[] suffixes = new Suffix[l];
		for(int i = 0;i<l;i++)
		{
			suffixes[i] = new Suffix(text,i);
		}
		Arrays.sort(suffixes);
		int[] suffixa = new int[l];
		for(int i = 0; i<l;i++)
		{
			suffixa[i] = suffixes[i].index;
			System.out.print(suffixa[i] + " ");
		}
		
	}
	
	public int cmp(Suffix a, Suffix b)
	{
		if(a.text == b.text)
			return 0;
		int m = Math.min(a.length(), b.length());
		for(int i = 0; i< m; i++)
		{
			if(a.charAt(i)<b.charAt(i))
				return -1;
			if(a.charAt(i)>b.charAt(i))
				return 1;
		}
		return a.length() - b.length();
	}
}
