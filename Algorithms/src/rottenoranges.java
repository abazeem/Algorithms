
public class rottenoranges {

	public static void main(String args[])
	{
		int[][] M = {{0,1,0},{0,1,0},{2,1,1}};
		System.out.print(check(M,M.length, M[0].length));
	}
	
	public static boolean convert(int[][] M, boolean[][] visited, int a , int b)
	{
		boolean flag = false;
		if( a - 1 >= 0 && M[a-1][b] == 1 )
		{
			M[a-1][b] = 2;
			visited[a-1][b] = true;
			flag = true;
		}
		if( b - 1 >= 0 && M[a][b -1 ] == 1)
		{
			M[a][b -1 ] = 2;
			visited[a][b-1] = true;
			flag = true;
		}
		if( b + 1 < M[a].length && M[a][b + 1 ] == 1)
		{
			M[a][b + 1 ] = 2;
			visited[a][b + 1] = true;
			flag = true;
		}
		if( a + 1 < M.length && M[a+1][b ] == 1)
		{
			M[a+1][b ] = 2;
			visited[a+1][b ] = true;
			flag = true;
		}
		return flag;
	}
	public static int check(int[][] M, int m, int n)
	{
		boolean override = false;
		boolean flag = false;
		int count = 0;
		boolean changesmade = false;
		while(!flag)
		{
			boolean[][] visited = new boolean[m][n];
			boolean one = false;
			override = false;
			for(int i = 0; i< m; i++)
			{
				for(int j = 0; j< n; j++)
				{
					if(M[i][j] == 1)
						one = true;
					if(M[i][j] == 2 && !visited[i][j])
					{
						changesmade = convert(M,visited, i , j);
						if(changesmade == true)
							override = true;
						
					}
				}
			}
			count++;
			if(!override && !one )
			{
				if(count-1 > 0)
					return count -1;
				else 
					return -1;
			}
				
			if(!override && one)
				return -1;
			one = false;	
		}
		return -1;
	}
	
}
