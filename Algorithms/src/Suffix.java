public class Suffix {

	String text;
	int index;
	
	public Suffix(String t, int i)
	{
		text = t;
		index = i;
	}
	
	public int length()
	{
		return text.length() - index;
	}
	public char charAt(int i)
	{
		return text.charAt(index + i);
	}
	
	public int cmp(Suffix that)
	{
		if(this.text == that.text)
			return 0;
		int m = Math.min(this.length(), that.length());
		for(int i = 0; i< m; i++)
		{
			if(this.charAt(i)<that.charAt(i))
				return -1;
			if(this.charAt(i)>that.charAt(i))
				return 1;
		}
		return this.length() - that.length();
	}
	
    public String toString() {
        return text.substring(index);
    }
}
