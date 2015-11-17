
public class Knighttour {

	public static void main(String args[])
	{
	int[] X = {  2, 1, -1, -2, -2, -1,  1,  2 };
	int[] Y = {  1, 2,  2,  1, -1, -2, -2, -1 };
	int[][] S = new int[8][8];
	for(int i = 0; i< S.length; i++)
	{
		for(int j = 0; j < S[i].length ; j++)
			S[i][j] = -1;
	}
	S[0][0] = 0;
	if(solve(0,0,1,X,Y,S))
		print(S);
	else
		System.out.println("Solution not possible");
	
	}
	
	public static void print(int[][] S)
	{
		for(int i = 0; i< 8; i++)
		{
			for(int j = 0; j < 8 ; j++)
				System.out.print(S[i][j] +" ");
			System.out.println("");
		}
	}
	
	public static boolean isSafe(int x, int y, int[][] S)
	{
		if( x >= 0 && x < S.length && y >= 0 && y < S.length && S[x][y] == -1)
			return true;
		else
			return false;
	}
	
	public static boolean solve(int x, int y , int move, int [] X, int[] Y, int[][] S)
	{
		int _x;
		int _y;
		if( move == S.length * S.length)
			return true;
		for(int k = 0; k < 8; k++)
		{
			_x = x + X[k];
			_y = y + Y[k];
			if(isSafe(_x,_y,S))
			{
				S[_x][_y] = move;
				if(solve(_x,_y,move+1,X,Y,S))
					return true;
				else
					S[_x][_y] = -1;
			}
		}
		return false;
	}
}
